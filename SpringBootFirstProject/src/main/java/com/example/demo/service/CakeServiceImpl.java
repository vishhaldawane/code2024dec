package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Cake;
import com.example.demo.repository.CakeRepository;

@Service
public class CakeServiceImpl implements CakeService {

	@Autowired
	CakeRepository cakeRepo;
	
	
	@Override
	public List<String> getCakeNamesByCost(float cost) {
		// TODO Auto-generated method stub
		System.out.println("CakeService: getCakeNamesByCost() invoked...");

		List<String> cakeNamesList = new ArrayList<String>();
		
		Iterable<Cake> iterable = cakeRepo.findAll();
		Iterator<Cake> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Cake theCake = iterator.next();
			if(theCake.getCakeCost() == cost) {
				cakeNamesList.add(theCake.getCakeName());
			}
		}
		return cakeNamesList;
	}

	@Override
	public List<Float> getCostByCakeWeight(float weight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Float> getWeightByCakeCost(float cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cake> getCakeByCost(float cost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cake> getCakeByWeight(float weight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cake> getCakeByName(String cakeName) {
		// TODO Auto-generated method stub
		return null;
	}

}
