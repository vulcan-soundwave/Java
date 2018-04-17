package dao;

import java.util.List;
import java.util.Map;

import entity.Logs;
import entity.LogsInf;

public interface LogsDao {

	int getTotalByEid(int eid);

	List<LogsInf> getDataByEid(Map<String, Object> m);

	void insert(Logs log);


}
