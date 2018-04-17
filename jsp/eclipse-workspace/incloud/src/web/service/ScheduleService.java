package web.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.Common;
import dao.EquipmentDao;
import dao.ScheduleDao;
import entity.Schedule;

@Transactional(rollbackFor = { Exception.class })
@Service
public class ScheduleService {

	private static Logger logger = Logger.getLogger(ScheduleService.class);

	@Autowired
	private ScheduleDao dao;
	@Autowired
	private EquipmentDao edao;

	public String getData(int no, int eid) {
		// TODO Auto-generated method stub
		Schedule s = null;
		try {
			s = dao.getDataByEid(eid);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.toString());
			return "";
		}
		String inf = null;
		if (s != null) {
			switch (no) {
			case 1:
				inf = s.getA();
				break;
			case 2:
				inf = s.getB();
				break;
			case 3:
				inf = s.getC();
				break;
			case 4:
				inf = s.getD();
				break;
			case 5:
				inf = s.getE();
				break;
			case 6:
				inf = s.getF();
				break;
			case 7:
				inf = s.getG();
				break;
			case 8:
				inf = s.getH();
				break;

			default:
				inf = s.getA();
			}
		}
		return inf;
	}

	public String getData2E(int no, int eid) {
		// TODO Auto-generated method stub
		Schedule s = null;
		try {
			s = dao.getDataByEid(eid);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.toString());
			return "";
		}
		String inf = null;
		if (s != null) {
			switch (no) {
			case 1:
				inf = s.getA();
				break;
			case 2:
				inf = s.getB();
				break;
			case 3:
				inf = s.getC();
				break;
			case 4:
				inf = s.getD();
				break;
			case 5:
				inf = s.getE();
				break;
			case 6:
				inf = s.getF();
				break;
			case 7:
				inf = s.getG();
				break;
			case 8:
				inf = s.getH();
				break;

			default:
				inf = s.getA();
			}
		}
		if(no==8){
			edao.SetConfirmFlag(eid);
		}
		return inf;
	}

	public void setData(int no, String inf, int eid) {
		// TODO Auto-generated method stub
		Schedule s = new Schedule();
		s.setEid(eid);
		switch (no) {
		case 1:
			s.setA(inf);
			break;
		case 2:
			s.setB(inf);
			break;
		case 3:
			s.setC(inf);
			break;
		case 4:
			s.setD(inf);
			break;
		case 5:
			s.setE(inf);
			break;
		case 6:
			s.setF(inf);
			break;
		case 7:
			s.setG(inf);
			break;
		case 8:
			s.setH(inf);
			break;
		default:
			break;
		}
		dao.update(s);
		edao.SetUpdataFlag(eid);
	}

}
