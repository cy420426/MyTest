package com.cy.community.controller;


import com.cy.community.entity.Discuss;
import com.cy.community.entity.discussUser;
import com.cy.community.service.DiscussService;
import com.cy.community.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @Autowired
    private DiscussService discussservice;
    @Autowired
    private userService userService;

    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public String getIndexPage(Model model)
    {
        List<Discuss> discuss = discussservice.findDiscuss(0, 0, 10);
        System.out.println(discuss);
        List<Map<String,Object>> discussposts = new ArrayList<>();
        if(discuss!=null)
        {
            for(Discuss s :discuss)
            {
                Map<String,Object> map = new HashMap<>();
                map.put("post",s);
                System.out.println(s.getId()+"曹越");
                discussUser discuss1 = userService.finduserById(s.getUserId());
                System.out.println(discuss1);
                map.put("user",discuss1);
                discussposts.add(map);
            }
        }
        model.addAttribute("discussposts",discussposts);
        return "/index";
    }

}
