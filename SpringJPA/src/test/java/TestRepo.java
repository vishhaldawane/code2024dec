import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.entity.Employee;
import com.vishal.repo.EmployeeJpaRepository;
import com.vishal.service.EmployeeService;

public class TestRepo {


	ApplicationContext context;
	
	@BeforeEach
	public void initialize() {
		context = new ClassPathXmlApplicationContext("MySpringConfig1.xml");	
		
	}	
	@Test
	public void testAllEmployees() {
		EmployeeJpaRepository empJpaRepo = context.getBean(EmployeeJpaRepository.class);
		Optional<Employee> emp = empJpaRepo.findById(7839);
		if(emp.isPresent()) {
			Employee empObj = emp.get();
			System.out.println("Emp Name : "+empObj.getEmployeeName());
			System.out.println("Emp Job  : "+empObj.getEmployeeJob());
			System.out.println("Emp DOJ  : "+empObj.getEmployeeHiredate());
			System.out.println("Emp SAL  : "+empObj.getSalary());
		}
		else {
			System.out.println("Employee not found");
		}
	}
	
	
	
}
