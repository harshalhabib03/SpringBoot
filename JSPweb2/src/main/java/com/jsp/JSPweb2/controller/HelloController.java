package com.jsp.JSPweb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String getIndexPage(Model model){
        String msg = "Welcome to Spring boot";
        model.addAttribute("Message",msg);
        System.out.println("Test case");
        return "index";
    }

    @RequestMapping("/admin")
    public String getAdminPage(){
        return "admin";
    }

    @RequestMapping("/user")
    public String getUserPage(){
        return "user";
    }
}
