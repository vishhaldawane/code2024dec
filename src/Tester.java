import java.util.List;

public class Tester {
	public static void main(String[] args) {

		//DishList
		List<Employee> empList = new ArrayList<Employee>();
		
		
		for(;;) {
			
			Employee e = new Employee(); //Dish
			empList.add(e);
		}
		
		List<Emplopyee> newList = getDish(empList.stream(), "Indian");
		
	}
}
