package test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.InfoDao;
import entity.Info;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContext.xml", "classpath:spring-context.xml" })
public class daotest extends AbstractJUnit4SpringContextTests {
	@Resource
	private InfoDao dao;

	@Test
	public void savetset() {
		Info i = dao.select("wtf");
		System.out.println(i.getJson());
	}

}
