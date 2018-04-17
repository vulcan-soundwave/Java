package web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.Common;
import dao.BloodpressureDao;
import entity.Bloodpressure;
import entity.BloodpressureInf;

@Transactional(rollbackFor = { Exception.class })
@Service
public class BloodpressureService {
	private static Logger logger = Logger.getLogger(BloodpressureService.class);

	@Autowired
	private BloodpressureDao dao;

	public List<BloodpressureInf> getData(int page, int eid) {
		// TODO Auto-generated method stub
		Map<String, Object> m = new HashMap<>();
		m.put("offset", (page - 1) * Common.PAGE_SIZE);
		m.put("size", Common.PAGE_SIZE);
		m.put("eid", eid);
		return dao.getDataByEid(m);
	}

	public int gettotal(int eid) {
		// TODO Auto-generated method stub
		return dao.getTotalByEid(eid);
	}

	public void insert(int eid, int H, int L, String time) {
		// TODO Auto-generated method stub
		Bloodpressure b = new Bloodpressure();
		b.setEid(eid);
		b.setH(H);
		b.setL(L);
		b.setTime(time);
		dao.insert(b);
	}

}
