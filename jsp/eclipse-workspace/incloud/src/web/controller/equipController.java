package web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import web.service.BloodpressureService;
import web.service.EquipmentService;
import web.service.HeartrateService;
import web.service.LogsService;
import web.service.OxygenService;
import web.service.ScheduleService;
import web.service.TemperatureService;
import web.service.WeightService;

@Controller
public class equipController {
	private static Logger logger = Logger.getLogger(equipController.class);
	@Autowired
	private WeightService weightService;
	@Autowired
	private EquipmentService equipmentService;
	@Autowired
	private HeartrateService heartService;
	@Autowired
	private TemperatureService tempService;
	@Autowired
	private OxygenService oxygenService;
	@Autowired
	private ScheduleService scheduleService;
	@Autowired
	private LogsService logService;
	@Autowired
	private BloodpressureService bpService;

	@RequestMapping(value = "communication")
	public void commnunication(HttpServletRequest request, HttpServletResponse response) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
		String lines;
		StringBuffer sb = new StringBuffer("");
		while ((lines = reader.readLine()) != null) {
			lines = new String(lines.getBytes(), "utf-8");
			sb.append(lines);
		}
		reader.close();
		String string = new String(sb);
		//
		// ////
		// System.out.println(string);
		/**
		 * Map<String, String> inf = new HashMap<String, String>(); inf =
		 * (Map<String, String>) JSON.parse(string);
		 **/
		Map<String, Object> inf = new HashMap<String, Object>();
		inf = (Map<String, Object>) JSON.parse(string);
		JSONObject json = new JSONObject();
		int type = (int) inf.get("type");
		int eid = (int) inf.get("eid");
		switch (type) {
		case 0:// heart
			if (equipmentService.isupdate(eid)) {
				json.put("status", 1);
			} else
				json.put("status", 0);
			break;
		case 1:// schedule
			String reinf = null;
			try {
				reinf = scheduleService.getData2E(eid, (int) inf.get("no"));
			} catch (Exception e) {
				// TODO: handle exception
				logger.error(e.toString());
			}
			json = JSONObject.parseObject(reinf);
			break;
		case 2:// logs
			logService.insert(eid, (int) inf.get("no"), (String) inf.get("time"));
			break;
		case 3:// infs
			int sid = -1;
			try {
				sid = (int) inf.get("sid");
			} catch (Exception e) {
				// TODO: handle exception
			}
			switch (sid) {
			case 0:
				heartService.insert(eid, (int) inf.get("inf"), (String) inf.get("time"));
				break;
			case 1:
				oxygenService.insert(eid, (int) inf.get("inf"), (String) inf.get("time"));
				break;
			case 2:
				bpService.insert(eid, (int) inf.get("H"), (int) inf.get("L"), (String) inf.get("time"));
				break;
			case 3:
				weightService.insert(eid, (float) inf.get("inf"), (String) inf.get("time"));
				break;
			case 4:
				tempService.insert(eid, (float) inf.get("inf"), (String) inf.get("time"));
				break;
			default:
				break;
			}
			break;

		default:
			break;
		}

		PrintWriter writer = response.getWriter();
		writer.println(json.toString());
		writer.flush();
		json = null;
		writer.close();
	}

}
