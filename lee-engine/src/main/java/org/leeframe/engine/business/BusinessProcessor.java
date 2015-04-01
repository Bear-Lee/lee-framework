package org.leeframe.engine.business;

import org.leeframe.engine.context.InvokeContext;

/**
 * 业务处理器接口
 * @Title: BusinessProcessor.java 

 * @Project: lee-engine

 * @Package: org.leeframe.engine.business

 * @Description: see class name

 * @author: boyueli@meilishuo.com

 * @date: 2015年3月30日 下午5:31:52
 */
public interface BusinessProcessor {
    public void check(InvokeContext context);
    
    public void process(InvokeContext context);
}
