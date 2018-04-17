package dao;

import java.util.Map;

import entity.User;

public interface UserDao {
	User getUserByUsername(String username);

	User getUserByUid(int uid);

	void insert(User user);

	void deleteByUsername(String username);

	void deleteByUid(int uid);

	void updateByPassword(User user);

	void updateByToken(Map<String, String> m);
	

}
