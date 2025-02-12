package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cake;

@Repository
public interface CakeRepository extends CrudRepository<Cake, Integer> {

	//custom queries
	
}
