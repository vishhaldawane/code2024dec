package com.example.demo.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping; 

// http://localhost:8080
// e7beeef4-0e84-4920-8414-048bcbaee5cf

@Controller
public class LoginController { 
	
	@GetMapping("/welcome") 
	public String welcome() { 
		return "welcome.html"; 
		
	} 
	
	@GetMapping("/login") 
	public String login() { 
		return "login.html"; 
		
	} 
}
