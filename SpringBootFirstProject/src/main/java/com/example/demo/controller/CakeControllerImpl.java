package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CakeService;

@RestController
@RequestMapping("/cakes")
public class CakeControllerImpl implements CakeController {

	@Autowired
	CakeService cakeService;
	
	@GetMapping("/greet")
	String greeting() {
		return "Welcome to Cake Example";
	}
	
	@GetMapping("/cost/{amt}")
	List<String> getCakeByCost(@PathVariable float amt) {
			System.out.println("CakeController: getCakeByCost() invoked...");
			return cakeService.getCakeNamesByCost(amt);
	}
}

// http://localhost:8080/cakes/greet












/*

	@GetMapping("/weight/{w}")
	String greeting(@RequestParam("w") float w) 
	{
		
		return null;
	}
	


*/