package org.leeframe.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.leeframe.model.UserInfo;
import org.leeframe.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Title: AppTest.java 

 * @Project: lee-dao

 * @Package: org.leeframe.dao

 * @Description: see class name

 * @author: boyueli@meilishuo.com

 * @date: 2015年3月14日 下午3:07:15
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml",
		"classpath:spring.xml" })
public class AppTest {

	@Autowired
	private UserInfoService userInfoService;
	
	
	@Test
	public void testUserInfo(){
	    UserInfo info=userInfoService.getById(1);
	    System.out.println(info.getUsermobile());
	}
}
