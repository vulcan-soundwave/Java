package recuit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.ShowDao;
import entity.Info;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml", "classpath:spring-context.xml" })
public class daotest extends AbstractJUnit4SpringContextTests {
	@Resource
	private ShowDao dao;

	@Test
	public void savetset() {
		Info h = dao.query("effective_data.html");
		System.out.println(h.getJson());
	}

}
