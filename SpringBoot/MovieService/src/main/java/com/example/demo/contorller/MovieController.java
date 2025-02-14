package com.example.demo.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;
import com.example.demo.vo.CinemaTemplate;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private MovieService service;
	
	@PostMapping(value = "/add", consumes = "application/json")
	public String saveMovie(@RequestBody Movie m) {
		service.save(m);
		return "Movie saved.";
	}
	
	@GetMapping(value = "/{id}", produces = "application/json")
	public Movie getMovie(@PathVariable int id) {
		return service.find(id);
	}
	
	@GetMapping(value = "/cinema/{id}", produces = "application/json")
	public CinemaTemplate getDetails(@PathVariable int id) {
		return service.details(id);
	}
	
	@GetMapping(value = "/cinema2/{id}", produces = "application/json")
	public CinemaTemplate getDetails2(@PathVariable int id) {
		return service.details2(id); //invoking feign client
	}
}
