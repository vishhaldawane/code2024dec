package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Cake;
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
	
	@GetMapping("/cost/{amt}") //URL names must be unique
	List<String> getCakeByCost(@PathVariable float amt) {
			System.out.println("CakeController: getCakeByCost() invoked...");
			return cakeService.getCakeNamesByCost(amt);
	}
	
	@GetMapping("/weight/{wt}") //URL names must be unique
	List<Float> getCakeByWeight(@PathVariable float wt) {
			System.out.println("CakeController: getCakeByWeight() invoked...");
			return cakeService.getCostByCakeWeight(wt);
	}
	
	@GetMapping("/all")
	List<Cake> getAllCakes() {
		System.out.println("CakeController: getAllCakes() invoked...");
		return cakeService.getAllCakes();
	}
}

// http://localhost:8080/cakes/greet
// http://localhost:8080/cakes/cost/500












/*

	@GetMapping("/weight/{w}")
	String greeting(@RequestParam("w") float w) 
	{
		
		return null;
	}
	


*/