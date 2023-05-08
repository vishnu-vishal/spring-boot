package com.newpro.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newpro.model.User;
import com.newpro.repository.UserRepository;
@Service
public class UserService {


	@Autowired
	UserRepository userRep ;
	
	public String checkLogin(String username,String password)
	{
		User u = userRep.findByusername(username) ;
		if(u == null)
		{
			return " No user found " ;
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}
	
	public User addUser(User m)
	{
		return userRep.save(m) ;
	}
	
}
