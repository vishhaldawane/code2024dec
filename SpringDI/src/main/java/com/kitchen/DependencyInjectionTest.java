package com.kitchen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		
		System.out.println("Begin main");
		
			System.out.println("====>  Creating application context...");
			ApplicationContext container= new ClassPathXmlApplicationContext("MySpringConfig1.xml");
			System.out.println("====> Application context created....");
			
			System.out.println("-------");
			//Tea tea = container.getBean(Tea.class);
			//tea.enjoy();
			//Milk m = new Milk();
			//Tea tea = new Tea(m);
			
			Coffee coffee = container.getBean(Coffee.class);
			coffee.enjoyCoffee();
			
		}

}

/*
 * 
 * 	MusicalInstrument mi = MusicShop.purchase("pluck");
		mi.play();

 */
interface MusicalInstrument { void play(); }

@Component
@Scope("prototype") // singleton

class Guitar implements MusicalInstrument {
	Guitar() {
		System.out.println("Guitar() ctor invoked...."+this);
	}
	public void play() {
		System.out.println("Plucking guitar strings...");
	}
}
class Violin implements MusicalInstrument {
	public void play() {
		System.out.println("Bowing Violin strings...");
	}
}
/*class MusicShop
{
	static MusicalInstrument purchase(String hint)
	{
		MusicalInstrument mi = null;
		
		if(hint.equalsIgnoreCase("bow")) {
			mi = new Violin();
		}
		else if(hint.equalsIgnoreCase("pluck")) {
			mi = new Guitar();
		}
		
		return mi;
	}
}*/

@Component
@Scope("prototype") // singleton

class Water
{
	int quantity;

	public Water() {
		super();
		System.out.println("Water() is created "+this);
	}
	
}

@Component
@Scope("prototype") // singleton
class Milk
{
	int quantity;

	public Milk() {
		super();
		System.out.println("Milk() is created "+this);
	}
	
}

@Component
@Scope("prototype") // singleton

class Sugar
{
	int quantity;

	public Sugar() {
		super();
		System.out.println("Sugar() is created "+this);
	}
	
}

@Component
@Scope("prototype") // singleton

class TeaPowder
{
	int quantity;

	public TeaPowder() {
		super();
		System.out.println("TeaPowder() is created "+this);
	}
	
}

@Component
@Scope("prototype") // singleton

class Ginger
{
	int quantity;

	public Ginger() {
		super();
		System.out.println("Ginger() is created "+this);
	}
	
}

@Component
@Scope("prototype") // singleton
class Tea
{

	/*Tea() {
		System.out.println("Tea() no arg/ default ctor...");
	}*/
	
	/*Tea(Water w)
	{
		System.out.println("Tea(Water) is created "+this);
	}*/
	
	Tea(Milk m, Water w, Sugar s, TeaPowder tp, Ginger g)
	{
		System.out.println("Tea(Milk) is created "+this+" Milk m is "+m);
	}
	void enjoy()
	{
		System.out.println("Tea is being enjoyed....");
	}
}

@Component
class CoffeePowder
{
	CoffeePowder() {
		System.out.println("CoffeePowder()....");
	}
	void aroma() {
		System.out.println("Coffee powder aroma nullifies the other aromas...");
	}
}

@Component
class Coffee
{
	@Autowired
	CoffeePowder cp; //as a field
	
	
	
	
	
	void enjoyCoffee() {
		System.out.println("enjoy the coffee...");
	}
	
	/*
	Coffee(CoffeePowder cp) {// cp set in a ctor
		System.out.println("Coffee ctor...cp "+cp);
		cp.aroma();
	}
	*/
}






