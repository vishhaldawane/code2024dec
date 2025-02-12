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
	
	public List<Cake> getAllCakes() {
		List<Cake> cakeList = new ArrayList<Cake>();
		 cakeRepo.findAll().forEach(cakeList::add); 
		 return cakeList;
	}

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
		System.out.println("CakeService: getCakeNamesByCost() invoked...");

		List<Float> cakeCostList = new ArrayList<Float>();
		
		Iterable<Cake> iterable = cakeRepo.findAll();
		Iterator<Cake> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Cake theCake = iterator.next();
			if(theCake.getCakeWeight() == weight) {
				cakeCostList.add(theCake.getCakeCost());
			}
		}
		return cakeCostList;
	}

	@Override
	public List<Float> getWeightByCakeCost(float cost) {
		System.out.println("CakeService: getCakeNamesByCost() invoked...");

		List<Float> cakeWeightList = new ArrayList<Float>();
		
		Iterable<Cake> iterable = cakeRepo.findAll();
		Iterator<Cake> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Cake theCake = iterator.next();
			if(theCake.getCakeCost() == cost) {
				cakeWeightList.add(theCake.getCakeWeight());
			}
		}
		return cakeWeightList;
	}

	@Override
	public List<Cake> getCakeByCost(float cost) {
		System.out.println("CakeService: getCakeNamesByCost() invoked...");

		List<Cake> cakeListAsPerCost = new ArrayList<Cake>();
		
		Iterable<Cake> iterable = cakeRepo.findAll();
		Iterator<Cake> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Cake theCake = iterator.next();
			if(theCake.getCakeCost() == cost) {
				cakeListAsPerCost.add(theCake);
			}
		}
		return cakeListAsPerCost;
	}

	@Override
	public List<Cake> getCakeByWeight(float weight) {
		System.out.println("CakeService: getCakeNamesByCost() invoked...");

		List<Cake> cakeListAsPerWeight = new ArrayList<Cake>();
		
		Iterable<Cake> iterable = cakeRepo.findAll();
		Iterator<Cake> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Cake theCake = iterator.next();
			if(theCake.getCakeWeight() == weight) {
				cakeListAsPerWeight.add(theCake);
			}
		}
		return cakeListAsPerWeight;
	}

	@Override
	public List<Cake> getCakeByName(String cakeName) {
		System.out.println("CakeService: getCakeNamesByCost() invoked...");

		List<Cake> cakeListByName = new ArrayList<Cake>();
		
		Iterable<Cake> iterable = cakeRepo.findAll();
		Iterator<Cake> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Cake theCake = iterator.next();
			if(theCake.getCakeName().equalsIgnoreCase(cakeName)) {
				cakeListByName.add(theCake);
			}
		}
		return cakeListByName;
	}

}
