package com.reglogin.WebApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reglogin.WebApplication.entity.User;
import com.reglogin.WebApplication.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public boolean registerUser(User user) {
		try {
			userRepo.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User loginUser(String email, String password) {
		
		User validUser = userRepo.findByEmail(email);
		
		if (validUser != null && validUser.getPassword().equals(password)) {
			return validUser;
		}
		return null;
	}
	
}
