package org.leeframe.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.leeframe.model.Departuretime;
import org.leeframe.service.DeparturetimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml",
		"classpath:spring.xml" })
public class AppTest {
	@Autowired
	private DeparturetimeService departuretimeService;

	@Test
	public void test1() {
		Departuretime departuretime = departuretimeService.getDepart(1);
		System.out.println(departuretime.getRoutename());
	}
}
