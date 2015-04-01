package org.leeframe.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.leeframe.engine.component.BusinessComponent;
import org.leeframe.engine.context.InvokeContext;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class BaseController {
    
    @Resource
    private BusinessComponent businessComponent;
    
    @RequestMapping(value = "/agree.htm")
    public String rest(HttpServletRequest request, String version, String service, String partner,
            String signType, String sign, String reqData, HttpServletResponse response,
            Model model){
	
	InvokeContext context = new InvokeContext();
	check(reqData, reqData, reqData, reqData, reqData, reqData);
	
	businessComponent.execute(context);
	
	flush(response,context);
	
	return null;
    }
    
    private void flush(HttpServletResponse response, InvokeContext context) {
    }

    protected void check(String version, String service, String partner, String signType,
            String sign, String reqData) {
	
    }
    
}
