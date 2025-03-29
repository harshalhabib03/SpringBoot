package com.jsp.JSPweb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    public String getIndexPage(){
        System.out.println("Inside Index Page");
        return "index";
    }

    @RequestMapping("/admin")
    public String getAdminPage(){
        System.out.println("Inside Admin Page");
        return "admin";
    }
}
