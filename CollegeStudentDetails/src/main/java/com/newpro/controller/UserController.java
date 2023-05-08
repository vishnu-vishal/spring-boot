package com.newpro.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.newpro.model.User;
import com.newpro.service.UserService;
@RestController
public class UserController {
	@Autowired
	 UserService userServ ;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String uname = loginData.get("username") ;
		String password = loginData.get("password") ;
		String result = userServ.checkLogin(uname, password) ;
		return result ;
	}
	
	@PostMapping("/adduser")
	public User addUser(@RequestBody User m)
	{
		return userServ.addUser(m) ;
	}
	
	
}
