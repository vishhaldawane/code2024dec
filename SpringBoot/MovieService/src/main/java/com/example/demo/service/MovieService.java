package com.example.demo.service;

import com.example.demo.entity.Movie;
import com.example.demo.vo.CinemaTemplate;

public interface MovieService {

	Movie save(Movie m);
	
	Movie find(int id);
	
	CinemaTemplate details(int id);
}
