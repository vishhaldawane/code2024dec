package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Wafers;

public interface WafersRepository extends CrudRepository<Wafers, Integer> {

}
