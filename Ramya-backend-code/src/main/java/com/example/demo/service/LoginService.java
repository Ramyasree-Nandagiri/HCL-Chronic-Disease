package com.example.demo.service;

import java.util.Optional;

import org.springframework.security.authentication.AuthenticationManager;

import com.example.demo.entity.LoginEntity;
import com.example.demo.repository.LoginRepository;

import org.springframework.security.crypto.password.PasswordEncoder;

public class LoginService {
	   private final AuthenticationManager authenticationManager = null;
	    private final LoginRepository loginRepository=null;
//	    private final JwtUtil jwtUtil;
	    private final PasswordEncoder passwordEncoder=null;
	    
	    
	    public Optional<LoginEntity> Login(String email,String password) {
			
	    	  Optional<LoginEntity> user = loginRepository.findByEmail(email);
	    	  
	    	  if(user.isEmpty()) {
            throw new RuntimeException("User not found");
           
        }
	    	  return user;
	    	 
	    	  
	    	  }
	

}
