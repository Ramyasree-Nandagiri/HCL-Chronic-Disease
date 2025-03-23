package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LoginEntity;
import com.example.demo.service.LoginService;

@RestController()
public class LoginController {
	 
	@Autowired
	private LoginService myservice;
	
	   @PostMapping("/login")
	    public String login(@RequestBody LoginEntity myLogin ) {
	       Optional<LoginEntity>  userLogin =  myservice.Login(myLogin.email,myLogin.password);
		return userLogin;
	    }
}
