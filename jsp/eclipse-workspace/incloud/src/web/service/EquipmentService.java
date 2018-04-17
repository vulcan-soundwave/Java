package web.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.EquipbaseDao;
import dao.EquipmentDao;
import dao.UserDao;
import entity.Equipbase;
import entity.Equipment;
import entity.User;

@Transactional(rollbackFor = { Exception.class })
@Service
public class EquipmentService {
	@Autowired
	private EquipmentDao dao;

	@Autowired
	private UserService userService;

	@Autowired
	private EquipbaseDao eqbdao;

	private static Logger logger = Logger.getLogger(EquipmentService.class);

	public int getEidByUid(int uid) {
		// TODO Auto-generated method stub
		Equipment equip = null;
		try {
			equip = dao.getEquipmentByUid(uid);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.toString());
			throw e;
		}
		return equip.getEid();
	}

	@SuppressWarnings("null")
	public int regist(String username, String password, String inf, String key) {
		Equipbase equipbase = null;
		try {
			equipbase = eqbdao.getEquipByEid(Integer.parseInt(inf));
			if (equipbase != null && key.equals(equipbase.getKey())) {
				Equipment equip = null;
				try {
					equip = dao.getEquipmentByEid(Integer.parseInt(inf));
					if (equip != null) {
						System.out.println(equip.getUid());
						return 1;
					}
				} catch (Exception e) {
					// TODO: handle exception
					// return 1;
				}
				if (equip == null)
					try {
						User u = new User();
						u.setUsername(username);
						u.setPassword(password);
						u.setToken(" ");
						// System.out.println("sh");
						int f = userService.adduser(u);
						// System.out.println(u.getUid());
						if (f != 0)
							return f;
						Equipment e = new Equipment();
						e.setEid(Integer.parseInt(inf));
						e.setUid(u.getUid());
						try {
							dao.insert(e);
						} catch (Exception e2) {
							logger.error(e2.toString());
							throw e2;
						}
					} catch (Exception e) {
						// TODO: handle exception
						return 1;
					}
				return 0;

			} else
				return 1;

		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.toString());
			throw e;
		}
	}

	public boolean isupdate(int eid) {
		// TODO Auto-generated method stub
		Equipment e = dao.getEquipmentByEid(eid);
		if (e.getFlag() == 1)
			return true;
		else
			return false;
	}

	public String getData(int eid, int no) {
		// TODO Auto-generated method stub
		
		Equipment e=dao.getEquipmentByEid(eid);
		return null;
	}
}
