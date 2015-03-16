package org.leeframe.common.business;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.google.common.collect.Maps;

@Component("hessianTest")
public class HessianTestImpl implements HessianTest{

    @Override
    public Map<String, Object> getUserInfo(Map<String, Object> dataMap) {
	Map<String, Object> map=Maps.newHashMap();
	map.put("key", 123);
	return map;
    }

    @Override
    public void testHello(String str) {
	System.out.println("System.out.println:"+str);
    }

}
