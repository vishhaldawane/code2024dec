import controller.PizzaController;

/*
 in layer architecture
 
 the project is split into multiple packages
 for the scalability and simplicity
 
 WHY --> to isolate different concerns of 
 the applications
 
 1. entity layer - for holding pojos represent the
 						data of the tables
      |plain old java object
      |it is also known as entity to hold
      |data of the table to represent
      | 
 2. dao or repository layer - for DB activities
     |
 3. service layer for writing business logic
 	  |
 4. controller layer - to communicate with the
 		the UI and service
 		
 * 
 */
public class LayerTest2 {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.placeOrder();
	}
}
class Customer
{
	PizzaController controller = new PizzaController();
	
	void placeOrder() {
		System.out.println("Customer placing order...");
		controller.takeOrder();
	}
}

