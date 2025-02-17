package com.example.demo.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 

// http://localhost:8080
// e7beeef4-0e84-4920-8414-048bcbaee5cf

@RestController
public class SimpleController { 
	
	@GetMapping("/")
	public String homePage() {
		return "<h1> Welcome to Home Page </h1> ";	
	}
	@GetMapping("/user")
	public String endUser() {
		return "<h1> Welcome End User </h1> <a href='logout'> Logout </a>";
	}
	@GetMapping("/admin")
	public String adminUser() {
		return "<h1> Welcome Admin User </h1> <a href='logout'> Logout </a>";
	}
}
