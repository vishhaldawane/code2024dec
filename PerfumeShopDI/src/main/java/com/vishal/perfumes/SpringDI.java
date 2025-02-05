package com.vishal.perfumes;

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
		Perfume p1 = (Perfume) context.getBean("fahrenheit");
		Perfume p2 = (Perfume) context.getBean("chanel");
		Perfume p3 = (Perfume) context.getBean("oud");

		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		System.out.println();

		System.out.println(p3);
				
	}

}
