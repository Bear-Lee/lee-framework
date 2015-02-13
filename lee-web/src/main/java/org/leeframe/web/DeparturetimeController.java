package org.leeframe.web;

import javax.servlet.http.HttpServletRequest;

import org.leeframe.model.Departuretime;
import org.leeframe.service.DeparturetimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("departuretime")
public class DeparturetimeController {
    @Autowired
    private DeparturetimeService departuretimeService; 
    
    @RequestMapping("/show")
    public String showDeparture(String id,HttpServletRequest request){
        
        Departuretime departuretime = departuretimeService.getDepart(2);
        System.out.println(departuretime.getRoutename());
        request.setAttribute("departure", departuretime);
        return "show";
    }
}
