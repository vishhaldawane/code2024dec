package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Chocolate;

public interface ChocolateRepository extends CrudRepository<Chocolate, Integer> {

}
