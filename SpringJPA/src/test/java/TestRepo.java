import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.vishal.entity.Employee;
import com.vishal.repo.EmployeeJpaRepository;
import com.vishal.service.EmployeeService;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"/MySpringConfig1.xml"}) 
public class TestRepo {

	@Autowired
	EmployeeJpaRepository empJpaRepo ;
	

	@Test
	public void testAllEmployees() {
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
