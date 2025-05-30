package in.harshal.main.services;

import org.springframework.stereotype.Service;

import in.harshal.main.entities.User;

@Service
public interface UserService 
{
	public boolean registerUser(User user);
	
	public User loginUser(String email, String password);
}
