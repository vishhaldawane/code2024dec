package repository;

import java.util.List;

import entity.Employee;

//below interface name can be EmployeeDAO
public interface EmployeeRepository {
	public void insertEmployee(Employee e);
	public void updateEmployee(Employee e);
	public void deleteEmployee(int empno);
	public Employee selectEmployee(int empno);
	public List<Employee> selectEmployees();
	
}
