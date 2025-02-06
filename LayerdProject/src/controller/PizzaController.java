package controller;

import service.PizzaService;

public class PizzaController // fourth layer - controller 
{	//to interact with the UI and service layer
	//it usually accepts the request from the
	// ui and talks with service layer
	
	PizzaService service = new PizzaService();
	
	public void takeOrder() {
		System.out.println("\tController taking order...");
		service.serveToTheCustomer();
	}
}