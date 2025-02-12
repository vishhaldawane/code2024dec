package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.CakeService;

@SpringBootTest
class SpringBootFirstProjectApplicationTests {

	@Autowired
	CakeService cakeService;
	
	@Test
	void testFindCakeNamesAsPerCakeCost() {
		
		List<String> cakeNames = cakeService.getCakeNamesByCost(1100);
		Assertions.assertTrue(cakeNames!=null);
		Assertions.assertTrue(cakeNames.size() > 0);
		for(String theCakeName : cakeNames) {
			System.out.println("Cake name : "+theCakeName);
		}
	}

}
