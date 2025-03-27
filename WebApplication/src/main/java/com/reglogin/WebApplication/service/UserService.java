package com.reglogin.WebApplication.service;

import org.springframework.stereotype.Service;

import com.reglogin.WebApplication.entity.User;

@Service
public interface UserService {

	public boolean registerUser(User user);
	
	public User loginUser(String email, String password);
}
