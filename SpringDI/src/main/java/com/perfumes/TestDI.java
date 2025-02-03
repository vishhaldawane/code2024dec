package com.perfumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TestDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("MySpringConfig1.xml");
		System.out.println("===== context is loaded =====");
		Perfume perfume = context.getBean(Perfume.class);
		perfume.trial();
		
	}
}
//blue de chanel
//fahernheit CD
//supremacy of oud

@Component
class Fragrance
{
	Fragrance() {
		System.out.println("Fragrance() ctor...");
	}
	void topNote() {
		System.out.println("lemon");
	}
	void middleNote() {
		System.out.println("nutmeg cinamon");
	}
	void baseNote() {
		System.out.println("leather....");
	}
}

@Component
class Perfume
{
	@Autowired
	Fragrance fragrance;
	
	/*@Autowired
	void kuchhbhi(Fragrance fragrance) {
		System.out.println("kuchhbhi(Fragrance) ..."+fragrance);
		this.fragrance = fragrance;
	}*/
	
	
	/*
	Perfume(Fragrance fragrance) {
		System.out.println("Perfume() ctor...");
		System.out.println("Perfume : fragrance : "+fragrance);
		this.fragrance = fragrance;
	}
	*/
	
	void trial() {
		fragrance.topNote();
		fragrance.middleNote();
		fragrance.baseNote();
	}
	
}
