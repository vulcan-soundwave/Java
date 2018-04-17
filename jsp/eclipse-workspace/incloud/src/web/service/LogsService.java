package web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.Common;
import dao.LogsDao;
import entity.Logs;
import entity.LogsInf;

@Transactional(rollbackFor = { Exception.class })
@Service
public class LogsService {
	private static Logger logger = Logger.getLogger(HeartrateService.class);

	@Autowired
	private LogsDao dao;

	public int gettotal(int eid) {
		// TODO Auto-generated method stub
		return dao.getTotalByEid(eid);
	}

	public List<LogsInf> getData(int page, int eid) {
		// TODO Auto-generated method stub
		Map<String, Object> m = new HashMap<>();
		m.put("offset", (page - 1) * Common.PAGE_SIZE);
		m.put("size", Common.PAGE_SIZE);
		m.put("eid", eid);
		return dao.getDataByEid(m);
	}

	public void insert(int eid, int no, String time) {
		// TODO Auto-generated method stub
		Logs log = new Logs();
		log.setEid(eid);
		log.setInf(no);
		log.setTime(time);
		dao.insert(log);
	}

}
