package web.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import common.GetPass;
import dao.UserDao;
import entity.User;

@Transactional(rollbackFor = { Exception.class })
@Service
public class UserService {
	@Autowired
	private UserDao dao;

	private static Logger logger = Logger.getLogger(UserService.class);

	// -1:flase
	public int verifyByToken(String username, String token) {
		User user = null;
		try {
			user = dao.getUserByUsername(username);
		} catch (Exception e) {
			logger.error(e.toString());
		}
		if (user != null && user.getToken().equals(token))
			return user.getUid();
		else
			return -1;
	}

	public int verifyByPassword(String username, String password) {
		User user = null;
		try {
			user = dao.getUserByUsername(username);
		} catch (Exception e) {
			logger.error(e.toString());
		}
		if (user != null && user.getPassword().equals(password))
			return user.getUid();
		else
			return -1;
	}

	public String resetToken(String username) {
		Map<String, String> m = new HashMap<>();
		String s = GetPass.get();
		System.out.println(s);
		m.put("token", s);
		m.put("username", username);
		try {
			dao.updateByToken(m);
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e.toString());
			throw e;
		}
		return s;
	}

	public int adduser(User u) {
		User v = null;
		try {
			v = dao.getUserByUsername(u.getUsername());

		} catch (Exception e) {
			// TODO: handle exception
			return 1;
		}
		if (v == null) {
			try {
				dao.insert(u);
				return 0;
			} catch (Exception e) {
				// TODO: handle exception
				return 1;
			}
		} else
			return 2;

	}

}
