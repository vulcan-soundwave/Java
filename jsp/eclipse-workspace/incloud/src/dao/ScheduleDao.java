package dao;

import entity.Schedule;

public interface ScheduleDao {

	Schedule getDataByEid(int eid);

	void update(Schedule schedule);
}
