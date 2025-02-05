import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.entity.Employee;
import com.vishal.repo.EmployeeRepository;

public class TestDI {
	public static void main(String[] args) {
		
		System.out.println("Loading spring container...");
		ApplicationContext context =
				new ClassPathXmlApplicationContext("MySpringConfig1.xml");	
		System.out.println("Spring container loaded...");
		EmployeeRepository repo = ( EmployeeRepository) context.getBean("impl2");
		List<Employee> emps = repo.getEmployees();
		for(Employee emp: emps) {
			System.out.println("Emp No   : "+emp.getEmployeeNumber());
			System.out.println("Emp Name : "+emp.getEmployeeName());
			System.out.println("Emp Job  : "+emp.getEmployeeJob());
			System.out.println("Emp DOJ  : "+emp.getEmployeeHiredate());
			System.out.println("Emp MGR  : "+emp.getManagerCode());
			System.out.println("Emp SAL  : "+emp.getSalary());
			System.out.println("Emp COMM : "+emp.getCommission());
			System.out.println("-----------------");
		}
	}
}
