package org.leeframe.test;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.leeframe.common.business.HessianTest;

import com.caucho.hessian.client.HessianProxyFactory;
import com.google.common.collect.Maps;

public class TestRmi {
    public static void main(String[] args) throws MalformedURLException {
	String url="http://127.0.0.1:8080/lee-web/hessian/hessianTest";
	HessianProxyFactory factory=new HessianProxyFactory();
	HessianTest test=(HessianTest) factory.create(HessianTest.class,url);
//	test.testHello("Hello");
	Map<String, Object> map=Maps.newHashMap();
	Map<String, Object> resMap = test.getUserInfo(map);
	System.out.println(resMap.get("key"));
	
    }
}
