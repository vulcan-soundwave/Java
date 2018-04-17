package web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.Common;
import dao.TemperatureDao;
import entity.Temperature;
import entity.TemperatureInf;

@Transactional(rollbackFor = { Exception.class })
@Service
public class TemperatureService {
	private static Logger logger = Logger.getLogger(TemperatureService.class);
	@Autowired
	private TemperatureDao dao;

	public int gettotal(int eid) {
		// TODO Auto-generated method stub
		return dao.getTotalByEid(eid);
	}

	public List<TemperatureInf> getData(int page, int eid) {
		// TODO Auto-generated method stub
		Map<String, Object> m = new HashMap<>();
		m.put("offset", (page - 1) * Common.PAGE_SIZE);
		m.put("size", Common.PAGE_SIZE);
		m.put("eid", eid);
		return dao.getDataByEid(m);
	}

	public void insert(int eid, float inf, String time) {
		// TODO Auto-generated method stub
		Temperature t = new Temperature();
		t.setEid(eid);
		t.setTemperature(inf);
		t.setTime(time);
		dao.insert(t);
	}

}
