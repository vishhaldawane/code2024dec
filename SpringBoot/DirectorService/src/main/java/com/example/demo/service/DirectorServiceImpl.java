package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Director;
import com.example.demo.repository.DirectorRepository;

@Service
public class DirectorServiceImpl implements DirectorService {

	@Autowired
	private DirectorRepository repo;
	
	@Override
	public Director save(Director d) {
		return repo.save(d);
	}

	@Override
	public Director find(int dirid) {
		return repo.findById(dirid).get();
	}
}
