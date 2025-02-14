package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Director;

@Service
public interface DirectorService {

	Director save(Director d);
	
	Director find(int dirid);
	
}
