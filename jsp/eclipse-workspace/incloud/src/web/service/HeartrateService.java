package web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.Common;
import dao.HeartrateDao;
import entity.Heartrate;
import entity.HeartrateInf;

@Transactional(rollbackFor = { Exception.class })
@Service
public class HeartrateService {
	private static Logger logger = Logger.getLogger(HeartrateService.class);

	@Autowired
	private HeartrateDao dao;

	public int gettotal(int eid) {
		// TODO Auto-generated method stub
		return dao.getTotalByEid(eid);
	}

	public List<HeartrateInf> getData(int page, int eid) {
		// TODO Auto-generated method stub
		Map<String, Object> m = new HashMap<>();
		m.put("offset", (page - 1) * Common.PAGE_SIZE);
		m.put("size", Common.PAGE_SIZE);
		m.put("eid", eid);
		return dao.getDataByEid(m);
	}

	public void insert(int eid, int inf, String time) {
		// TODO Auto-generated method stub
		Heartrate heart = new Heartrate();
		heart.setEid(eid);
		heart.setRate(inf);
		heart.setTime(time);
		dao.insert(heart);
	}

}
