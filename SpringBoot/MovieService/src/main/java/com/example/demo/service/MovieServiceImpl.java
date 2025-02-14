package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;
import com.example.demo.vo.CinemaTemplate;
import com.example.demo.vo.Director;
@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository repo;
	
	@Autowired
	private RestTemplate rest;
//import org.springframework.web.client.RestTemplate;

	
	@Override
	public Movie save(Movie m) {
		return repo.save(m);
	}

	@Override
	public Movie find(int id) {
		return repo.findById(id).get();
	}

	@Override
	public CinemaTemplate details(int id) {
		CinemaTemplate cinema = new CinemaTemplate();
		
		Movie m = repo.findById(id).get();
		Director d = 
		rest.getForObject("http:"
		+ "//DIRECTORSERVICE/director/"+m.getDirectorId(), Director.class);
		
		
		cinema.setDirector(d);
		cinema.setMovie(m);
		return cinema;
	}
}
