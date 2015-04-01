package org.leeframe.engine.component;

import org.leeframe.engine.context.InvokeContext;
import org.springframework.stereotype.Component;

/**
 * 业务组建
 * @Title: BusinessComponent.java 

 * @Project: lee-engine

 * @Package: org.leeframe.engine.component

 * @Description: see class name

 * @author: boyueli@meilishuo.com

 * @date: 2015年3月30日 下午6:20:32
 */
@Component
public interface BusinessComponent {
    void execute(InvokeContext context);
}
