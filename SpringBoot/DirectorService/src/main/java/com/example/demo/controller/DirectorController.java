package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Director;
import com.example.demo.service.DirectorService;

@RestController
@RequestMapping("/director")
public class DirectorController {

	@Autowired
	private DirectorService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String saveDirector(@RequestBody Director dir) {
		service.save(dir);
		return "Director saved.";
	}
	
	// localhost:9001/director/1
	@GetMapping(value = "/{id}", produces = "application/json")
	public Director getDirector(@PathVariable int id) {
		return service.find(id);
	}
}
