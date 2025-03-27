package com.reglogin.WebApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reglogin.WebApplication.entity.User;
import com.reglogin.WebApplication.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@RestController
public class MyController {
	
	@Autowired
	private UserService userservice;
	
	@GetMapping("/regPage")
	public String openRegPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user") User user, Model model) {
		
		boolean status = userservice.registerUser(user);
		
		if (status) {
			model.addAttribute("successMsg", "User Registered Successfully");
		}
		else {
			model.addAttribute("errorMsg", "User Not Registered");
		}
		
		return "register";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage(Model model) {
		
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user") User user, Model model) {
		
		User validUser = userservice.loginUser(user.getEmail(), user.getPassword());
		
		if (validUser != null) {
			
			model.addAttribute("modelName", validUser.getName());
			return "profile";
		} else {
			model.addAttribute("errorMsg", "Email Id & Password didn't matched");
			return "login";
		}
	}
	
	@GetMapping("/logout")
	public String logoutUser(HttpServletRequest request) {
		
		HttpSession session =  request.getSession(false);
		
		if (session != null) {
			session.invalidate();
			return "login";
		}
		return null;
		
	}
}
