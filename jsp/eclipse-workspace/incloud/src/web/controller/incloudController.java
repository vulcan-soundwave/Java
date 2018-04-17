package web.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import common.Common;
import entity.BloodpressureInf;
import entity.HeartrateInf;
import entity.LogsInf;
import entity.OxygenInf;
import entity.TemperatureInf;
import entity.Weight;
import entity.WeightInf;
import web.service.BloodpressureService;
import web.service.EquipmentService;
import web.service.HeartrateService;
import web.service.LogsService;
import web.service.OxygenService;
import web.service.ScheduleService;
import web.service.TemperatureService;
import web.service.UserService;
import web.service.WeightService;

@Controller
public class incloudController {
	private static Logger logger = Logger.getLogger(incloudController.class);
	@Autowired
	private UserService userService;
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

	@RequestMapping(value = "sayhello")
	public void sayhello(HttpServletRequest request, HttpServletResponse response) throws IOException {

		JSONObject json = new JSONObject();
		json.put("inf", "hello");
		json.put("info", "hello");

		PrintWriter writer = response.getWriter();
		writer.println(json.toString());
		writer.flush();
		json = null;
		writer.close();
	}

	@RequestMapping(value = "request")
	public void response(HttpServletRequest request, HttpServletResponse response) throws IOException {
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

		// ////
		// Map<String, Object> test = (Map<String, Object>) JSON.parse(string);
		// int testt = (int) test.get("type");
		// String uuu=(String) test.get("username");
		// System.out.println(testt+" "+uuu);

		int type = -1;
		try {
			// type = Integer.parseInt((String) inf.get("type"));
			type = (int) inf.get("type");
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.toString());
		}
		JSONObject json = new JSONObject();
		int uid = -1;
		switch (type) {
		case 0:// logout
			userService.resetToken((String) inf.get("username"));
			json.put("status", 0);
			break;
		case 1:// login
			uid = userService.verifyByPassword((String) inf.get("username"), (String) inf.get("password"));
			if (uid != -1) {
				json.put("status", 0);
				json.put("inf", userService.resetToken((String) inf.get("username")));
			}
			break;
		case 2:// regist
			int s = 1;
			try {
				s = equipmentService.regist((String) inf.get("username"), (String) inf.get("password"),
						(String) inf.get("inf"), (String) inf.get("key"));
			} catch (Exception e) {
				// TODO: handle exception
				logger.error(e.toString());
			}
			json.put("status", s);
			break;
		case 3:// weight
			uid = userService.verifyByToken((String) inf.get("username"), (String) inf.get("token"));
			if (uid != -1) {
				int eid = equipmentService.getEidByUid(uid);
				int page = 1;
				if (inf.get("page") != null) {
					page = (int) inf.get("page");
				}
				int c = 0;
				try {
					c = weightService.gettotal(eid);
				} catch (Exception e) {
					// TODO: handle exception
				}
				int total = ((c + Common.PAGE_SIZE - 1) / Common.PAGE_SIZE);
				if (page > total)
					page = total;
				if (page <= 0)
					page = 1;
				List<WeightInf> reinf = weightService.getData(page, eid);
				json.put("status", 0);
				json.put("inf", reinf);
				json.put("page", page);
			}
			break;
		case 4:// heartrate
			uid = userService.verifyByToken((String) inf.get("username"), (String) inf.get("token"));
			if (uid != -1) {
				int eid = equipmentService.getEidByUid(uid);
				int page = 1;
				if (inf.get("page") != null) {
					page = (int) inf.get("page");
				}
				int c = 0;
				try {
					c = heartService.gettotal(eid);
				} catch (Exception e) {
					// TODO: handle exception
				}
				int total = ((c + Common.PAGE_SIZE - 1) / Common.PAGE_SIZE);
				if (page > total)
					page = total;
				if (page <= 0)
					page = 1;
				List<HeartrateInf> reinf = heartService.getData(page, eid);
				json.put("status", 0);
				json.put("inf", reinf);
				json.put("page", page);
			}
			break;
		case 5:// temperature
			uid = userService.verifyByToken((String) inf.get("username"), (String) inf.get("token"));
			if (uid != -1) {
				int eid = equipmentService.getEidByUid(uid);
				int page = 1;
				if (inf.get("page") != null) {
					page = (int) inf.get("page");
				}
				int c = 0;
				try {
					c = tempService.gettotal(eid);
				} catch (Exception e) {
					// TODO: handle exception
				}
				int total = ((c + Common.PAGE_SIZE - 1) / Common.PAGE_SIZE);
				if (page > total)
					page = total;
				if (page <= 0)
					page = 1;
				List<TemperatureInf> reinf = tempService.getData(page, eid);
				json.put("status", 0);
				json.put("inf", reinf);
				json.put("page", page);
			}

			break;
		case 6:// oxygen
			uid = userService.verifyByToken((String) inf.get("username"), (String) inf.get("token"));
			if (uid != -1) {
				int eid = equipmentService.getEidByUid(uid);
				int page = 1;
				if (inf.get("page") != null) {
					page = (int) inf.get("page");
				}
				int c = 0;
				try {
					c = oxygenService.gettotal(eid);
				} catch (Exception e) {
					// TODO: handle exception
				}
				int total = ((c + Common.PAGE_SIZE - 1) / Common.PAGE_SIZE);
				if (page > total)
					page = total;
				if (page <= 0)
					page = 1;
				List<OxygenInf> reinf = oxygenService.getData(page, eid);
				json.put("status", 0);
				json.put("inf", reinf);
				json.put("page", page);
			}
			break;
		case 7:// showschedule
			uid = userService.verifyByToken((String) inf.get("username"), (String) inf.get("token"));
			if (uid != -1) {
				int eid = equipmentService.getEidByUid(uid);
				int no = 1;
				if (inf.get("no") != null) {
					no = (int) inf.get("no");
				}
				if (no > 8)
					no = 8;
				if (no <= 0)
					no = 1;
				String reinf = scheduleService.getData(no, eid);
				json.put("status", 0);
				json.put("inf", reinf);
			}

			break;
		case 8:// setschedule
			uid = userService.verifyByToken((String) inf.get("username"), (String) inf.get("token"));
			if (uid != -1) {
				int eid = equipmentService.getEidByUid(uid);
				int no = -1;
				if (inf.get("no") != null) {
					no = (int) inf.get("no");
				}
				if (no <= 8 && no >= 1) {
					scheduleService.setData(no, (String) inf.get("inf"), eid);
					json.put("status", 0);
				} else
					json.put("status", 1);
			}

			break;
		case 9:// showlog
			uid = userService.verifyByToken((String) inf.get("username"), (String) inf.get("token"));
			if (uid != -1) {
				int eid = equipmentService.getEidByUid(uid);
				int page = 1;
				if (inf.get("page") != null) {
					page = (int) inf.get("page");
				}
				int c = 0;
				try {
					c = logService.gettotal(eid);
				} catch (Exception e) {
					// TODO: handle exception
				}
				int total = ((c + Common.PAGE_SIZE - 1) / Common.PAGE_SIZE);
				if (page > total)
					page = total;
				if (page <= 0)
					page = 1;
				List<LogsInf> reinf = logService.getData(page, eid);
				json.put("status", 0);
				json.put("inf", reinf);
				json.put("page", page);
			}
			break;
		case 10:// bloodpressure
			uid = userService.verifyByToken((String) inf.get("username"), (String) inf.get("token"));
			if (uid != -1) {
				int eid = equipmentService.getEidByUid(uid);
				int page = 1;
				if (inf.get("page") != null) {
					page = (int) inf.get("page");
				}
				int c = 0;
				try {
					c = bpService.gettotal(eid);
				} catch (Exception e) {
					// TODO: handle exception
				}
				int total = ((c + Common.PAGE_SIZE - 1) / Common.PAGE_SIZE);
				if (page > total)
					page = total;
				if (page <= 0)
					page = 1;
				List<BloodpressureInf> reinf = bpService.getData(page, eid);
				json.put("status", 0);
				json.put("inf", reinf);
				json.put("page", page);
			}
			break;
		//
		////
		//
		default:
			json.put("status", 1);
			break;
		}

		PrintWriter writer = response.getWriter();
		writer.println(json.toString());
		writer.flush();
		json = null;
		writer.close();
	}
}
