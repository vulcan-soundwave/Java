package incloud;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.HeartrateDao;
import dao.ScheduleDao;
import dao.TemperatureDao;
import dao.UserDao;
import dao.WeightDao;
import entity.Heartrate;
import entity.Schedule;
import entity.Temperature;
import entity.User;
import entity.Weight;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml", "classpath:spring-context.xml" })
public class daotest extends AbstractJUnit4SpringContextTests {
	@Resource
	private TemperatureDao dao;

	@Test
	public void savetset() {
		Temperature h = new Temperature();
		h.setEid(1);
		h.setTime("2016-12-22 12:11:32");
		float s = (float) 12.22;
		h.setTemperature(s);
		dao.insert(h);
	}

}
