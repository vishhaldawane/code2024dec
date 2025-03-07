package com.example.demo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Cake;
import com.example.demo.repository.CakeRepository;
import com.example.demo.service.exceptions.CakeAlreadyExistsException;
import com.example.demo.service.exceptions.CakeNotFoundException;

@Service
public class CakeServiceImpl implements CakeService {

	@Autowired
	CakeRepository cakeRepo;
	
	
	
	public Cake getCake(int cakeId)
	{
		return cakeRepo.findById(cakeId).orElseThrow(
				() -> new CakeNotFoundException(
						"NO CAKE PRESENT WITH ID = " + cakeId)
				      ); 
	}
	
	@Transactional
	public String addCake(Cake cake) {
		//return cakeRepo.save(cake);
		Cake existingCake = cakeRepo.findById(cake.getCakeId())
	               .orElse(null);
			 
	     if (existingCake == null) {
	         cakeRepo.save(cake);
	         return "Cake added successfully";
	     }
	     else
	         throw new CakeAlreadyExistsException(
	             "Cake already exists!!");
 

	}
	
	public String updateCake(Cake cake) {
		Cake existingCake = cakeRepo.findById(cake.getCakeId())
              .orElse(null);
		
	    if (existingCake == null)
	        throw new CakeNotFoundException("No Such Cake exists!!");
	    else {
	    	existingCake.setCakeName(cake.getCakeName());
	    	existingCake.setCakeCost(cake.getCakeCost());
	    	existingCake.setCakeWeight(cake.getCakeWeight());
	    	
	        cakeRepo.save(existingCake);
	        return "Cake updated Successfully";
	    }

	}
	
	public void deleteCake(Cake cake) {
		cakeRepo.delete(cake);
	}
	public void deleteCakeById(int cakeId) {
		cakeRepo.deleteById(cakeId);
	}
	
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
		
		/*Iterable<Cake> iterable = cakeRepo.findAll();
		Iterator<Cake> iterator = iterable.iterator();
		while(iterator.hasNext()) {
			Cake theCake = iterator.next();
			if(theCake.getCakeCost() == cost) {
				cakeNamesList.add(theCake.getCakeName());
			}
		}
		return cakeNamesList;*/
		cakeRepo.findAll().forEach(
				(cakeObj)->
				{ 
					if(cakeObj.getCakeCost()==cost) 
						cakeNamesList.add(cakeObj.getCakeName());
				}
		);
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
