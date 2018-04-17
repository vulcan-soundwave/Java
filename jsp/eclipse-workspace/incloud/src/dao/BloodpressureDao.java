package dao;

import java.util.List;
import java.util.Map;

import entity.Bloodpressure;
import entity.BloodpressureInf;

public interface BloodpressureDao {

	List<BloodpressureInf> getDataByEid(Map<String, Object> m);

	int getTotalByEid(int eid);

	void insert(Bloodpressure b);

}
