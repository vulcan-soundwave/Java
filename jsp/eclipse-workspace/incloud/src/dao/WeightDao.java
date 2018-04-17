package dao;

import java.util.List;
import java.util.Map;

import entity.Weight;
import entity.WeightInf;

public interface WeightDao {

	List<WeightInf> getDataByEid(Map<String, Object> m);

	int getTotalByEid(int eid);

	void insert(Weight w);

}
