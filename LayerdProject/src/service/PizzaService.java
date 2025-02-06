package service;

import repository.PizzaRepository;

public class PizzaService // third layer - business service layer
{
	PizzaRepository repo = new PizzaRepository();
	
	public void serveToTheCustomer() {
		System.out.println("\t\tService is serving to the customer....");
		repo.prepareFood();
	}
}
