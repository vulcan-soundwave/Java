package dao;

import java.util.List;
import java.util.Map;

import entity.Temperature;
import entity.TemperatureInf;

public interface TemperatureDao {

	int getTotalByEid(int eid);

	List<TemperatureInf> getDataByEid(Map<String, Object> m);

	void insert(Temperature t);

}
