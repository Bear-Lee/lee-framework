package org.leeframe.dao;

import java.util.ArrayList;
import java.util.List;

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
	    
	    List<UserInfo> list=new ArrayList<UserInfo>();
	    UserInfo u1=new UserInfo();
	    u1.setId(1);
	    u1.setUserage(10);
	    u1.setUsermobile("电话1");
	    
	    UserInfo u2=new UserInfo();
	    u2.setId(2);
	    u2.setUserage(12);
	    u2.setUsermobile("电话2");
	    
	    list.add(u1);
	    list.add(u2);
	    
	    int i=userInfoService.updateBatch(list);
	    System.out.println("操作了"+i+"行数据");
	    
//	    System.out.println(info.getUsermobile());
	}
}
