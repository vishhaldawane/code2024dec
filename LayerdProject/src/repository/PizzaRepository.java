package repository;

import entity.Pizza;

public class PizzaRepository // second layer - repository layer
{
	Pizza entity = new Pizza();
	
	public void prepareFood() {
		System.out.println("\t\t\tRepository is preparing food for the customer...");
		entity.actualFood();
	}
}
