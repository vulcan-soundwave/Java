package web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.Common;
import dao.WeightDao;
import entity.Weight;
import entity.WeightInf;

@Service
public class WeightService {
	private static Logger logger = Logger.getLogger(WeightService.class);

	@Autowired
	private WeightDao dao;

	public int gettotal(int eid) {
		// TODO Auto-generated method stub
		return dao.getTotalByEid(eid);
	}

	public List<WeightInf> getData(int page, int eid) {
		// TODO Auto-generated method stub
		Map<String, Object> m = new HashMap<>();
		m.put("offset", (page - 1) * Common.PAGE_SIZE);
		m.put("size", Common.PAGE_SIZE);
		m.put("eid", eid);
		return dao.getDataByEid(m);

	}

	public void insert(int eid, float weight, String time) {
		// TODO Auto-generated method stub
		Weight w = new Weight();
		w.setEid(eid);
		w.setTime(time);
		w.setWeight(weight);
		dao.insert(w);
	}

}
