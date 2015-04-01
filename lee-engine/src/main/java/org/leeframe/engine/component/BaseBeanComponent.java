package org.leeframe.engine.component;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 自动加载业务处理器
 * @Title: BaseBeanComponent.java 

 * @Project: lee-engine

 * @Package: org.leeframe.engine.component

 * @Description: see class name

 * @author: boyueli@meilishuo.com

 * @date: 2015年3月30日 下午5:48:44
 */
public class BaseBeanComponent extends InstantiationAwareBeanPostProcessorAdapter implements ApplicationContextAware{

    private ApplicationContext context;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
	    throws BeansException {
	if(context==null){
	    context=applicationContext;
	}
    }

}
