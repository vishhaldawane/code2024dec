package com.vishal.perfumes;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDI {

	public static void main(String[] args) {

		//Perfume perfume1 = new Perfume();
		//System.out.println(perfume1);
		System.out.println("Loading spring container...");
		ApplicationContext context =
				new ClassPathXmlApplicationContext("MySpringConfig1.xml");	
		System.out.println("Spring container loaded...");
		/*Perfume p1 = (Perfume) context.getBean("fahrenheit");
		Perfume p2 = (Perfume) context.getBean("chanel");
		Perfume p3 = (Perfume) context.getBean("oud");

		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();

		System.out.println(p3);
		System.out.println("-----------");*/

		PerfumeShop ps = (PerfumeShop) context.getBean("ps");
		System.out.println("Perfume Shop Id   : "+ps.getShopId());
		System.out.println("Perfume Shop Name : "+ps.getShopName());
		List<Perfume> persumes = ps.getListOfPerfumes();
		for (Perfume perfume : persumes) {
			System.out.println("Perfume Id        : "+perfume.getPerfumeId());
			System.out.println("Perfume Name      : "+perfume.getPerfumeName());
			System.out.println("Perfume Price     : "+perfume.getPrice());
			System.out.println("-------------------");

			System.out.println("Perfume Fragrance Details");
			Fragrance frag = perfume.getFragrance();
			
			System.out.println("Top    Note "+frag.getTopNote());
			System.out.println("Middle Note "+frag.getMiddleNote());
			System.out.println("Base   Note "+frag.getBaseNote());
			System.out.println("==========================================");
			
					//+perfume.getPerfumeId());
						
		}
	}

}
