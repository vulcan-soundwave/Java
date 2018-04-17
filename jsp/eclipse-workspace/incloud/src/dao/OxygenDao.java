package dao;

import java.util.List;
import java.util.Map;

import entity.Oxygen;
import entity.OxygenInf;

public interface OxygenDao {

	int getTotalByEid(int eid);

	List<OxygenInf> getDataByEid(Map<String, Object> m);

	void insert(Oxygen o);

}
