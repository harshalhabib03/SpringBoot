package com.task1.Integration.controller;

import com.task1.Integration.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.task1.Integration.model.Emp;

@Controller
public class MyController {
	@Autowired
    Employee emp;
    @GetMapping("/msg")
    public String homePage(Model model) {
        model.addAttribute("message", "Welcome to Spring Boot!");
        return "index"; // Refers to the "index.html" file in templates
    }
}

