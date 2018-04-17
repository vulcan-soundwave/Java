package web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.Common;
import dao.OxygenDao;
import entity.Oxygen;
import entity.OxygenInf;

@Transactional(rollbackFor = { Exception.class })
@Service
public class OxygenService {
	private static Logger logger = Logger.getLogger(OxygenService.class);
	@Autowired
	private OxygenDao dao;

	public int gettotal(int eid) {
		// TODO Auto-generated method stub
		return dao.getTotalByEid(eid);
	}

	public List<OxygenInf> getData(int page, int eid) {
		// TODO Auto-generated method stub
		Map<String, Object> m = new HashMap<>();
		m.put("offset", (page - 1) * Common.PAGE_SIZE);
		m.put("size", Common.PAGE_SIZE);
		m.put("eid", eid);
		return dao.getDataByEid(m);
	}

	public void insert(int eid, int inf, String time) {
		// TODO Auto-generated method stub
		Oxygen o = new Oxygen();
		o.setEid(eid);
		o.setOxygen(inf);
		o.setTime(time);
		dao.insert(o);
	}
}
