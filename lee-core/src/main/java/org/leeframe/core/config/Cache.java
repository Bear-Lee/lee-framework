package org.leeframe.core.config;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Cache {
    private static final Logger logger=LoggerFactory.getLogger(Cache.class);
    
    private static Map<String, Object> businessMap=new HashMap<String, Object>();
    
    public static void cleanBusinessMap(){
	businessMap.clear();
	logger.info("缓存已清除");
    }
    
    public static Object getBusinessObject(String key){
	Object value=businessMap.get(key);
	return value;
    }
    
}
