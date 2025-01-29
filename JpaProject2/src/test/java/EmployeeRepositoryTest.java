import java.sql.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.Employee;
import repository.EmployeeRepository;
import repository.EmployeeRepositoryImpl;

public class EmployeeRepositoryTest {
	EmployeeRepository employeeRepository;
	
	@BeforeEach
	public void setUp() {
		employeeRepository = new EmployeeRepositoryImpl();
	}
	
	@Test
	public void insertEmployeeTest()
	{
		Assertions.assertTrue(employeeRepository!=null);	
		Employee emp = new Employee();		
		emp.setEmployeeNumber(7799);
		emp.setEmployeeName("Virat K");emp.setEmployeeJob("Cricketer");
		emp.setManagerCode(7839);//<--existing emp number
		emp.setEmployeeHiredate(Date.valueOf("2024-11-22"));
		emp.setSalary(6666);emp.setCommission(444);
		emp.setDeptNumber(10);
		employeeRepository.insertEmployee(emp);
	}
}
