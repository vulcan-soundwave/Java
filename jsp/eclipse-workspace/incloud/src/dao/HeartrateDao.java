package dao;

import java.util.List;
import java.util.Map;

import entity.Heartrate;
import entity.HeartrateInf;

public interface HeartrateDao {

	int getTotalByEid(int eid);

	List<HeartrateInf> getDataByEid(Map<String, Object> m);

	void insert(Heartrate heart);

}
