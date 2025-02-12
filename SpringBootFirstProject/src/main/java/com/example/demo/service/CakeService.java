package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Cake;

@Service
public interface CakeService {

	List<String> getCakeNamesByCost(float cost); //500
	List<Float> getCostByCakeWeight(float weight); //500
	List<Float> getWeightByCakeCost(float cost); //1200
	
	List<Cake> getCakeByCost(float cost); //750
	List<Cake> getCakeByWeight(float weight);//500gm
	List<Cake> getCakeByName(String cakeName);//chocoruffle
	
}
