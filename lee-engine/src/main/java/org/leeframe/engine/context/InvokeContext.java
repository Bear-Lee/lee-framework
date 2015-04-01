package org.leeframe.engine.context;

import java.util.Map;

import com.google.common.collect.Maps;

/**
 * 业务作业上下午
 * @Title: InvokeContext.java 

 * @Project: lee-engine

 * @Package: org.leeframe.engine.context

 * @Description: see class name

 * @author: boyueli@meilishuo.com

 * @date: 2015年3月30日 下午5:33:47
 */
public class InvokeContext {
    private String version;
    private String service;
    private String sign;
    private String reqData;
    private Map<String, Object>  params=Maps.newHashMap();
    private String process;
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getService() {
        return service;
    }
    public void setService(String service) {
        this.service = service;
    }
    public String getSign() {
        return sign;
    }
    public void setSign(String sign) {
        this.sign = sign;
    }
    public String getReqData() {
        return reqData;
    }
    public void setReqData(String reqData) {
        this.reqData = reqData;
    }
    public Map<String, Object> getParams() {
        return params;
    }
    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
    public String getProcess() {
        return process;
    }
    public void setProcess(String process) {
        this.process = process;
    }
    
}
