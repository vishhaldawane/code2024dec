
public class LayerTest2 {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.placeOrder();
	}
}
class Customer
{
	Controller controller = new Controller();
	
	void placeOrder() {
		System.out.println("Customer placing order...");
		controller.takeOrder();
	}
}
class Controller
{
	Service service = new Service();
	
	void takeOrder() {
		System.out.println("\tController taking order...");
		service.serveToTheCustomer();
	}
}
class Service
{
	Repository repo = new Repository();
	
	void serveToTheCustomer() {
		System.out.println("\t\tService is serving to the customer....");
		repo.prepareFood();
	}
}
class Repository
{
	Entity entity = new Entity();
	
	void prepareFood() {
		System.out.println("\t\t\tRepository is preparing food for the customer...");
		entity.actualFood();
	}
}
class Entity
{
	void actualFood() {
		System.out.println("\t\t\t\tThis is the actual food.....");
	}
}
