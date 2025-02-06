import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishal.entity.Employee;
import com.vishal.service.EmployeeService;

public class TestService {

	ApplicationContext context;
	
	@BeforeEach
	public void initialize() {
		context = new ClassPathXmlApplicationContext("MySpringConfig1.xml");	
	}	
	@Test
	public void testFetchAllEmps() {
		EmployeeService empService =
				context.getBean(EmployeeService.class);
		List<Employee> listOfEmps = empService.loadAllEmployees();
		Assertions.assertTrue(listOfEmps!=null);
		Assertions.assertTrue(listOfEmps.size() > 0);
		listOfEmps.forEach( (e) -> { System.out.println(e.getEmployeeName()); } );
		
	}
}
