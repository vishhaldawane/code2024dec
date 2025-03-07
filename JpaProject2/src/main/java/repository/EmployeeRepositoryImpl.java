package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import entity.Employee;

public class EmployeeRepositoryImpl extends BaseRepository implements EmployeeRepository {

	public EmployeeRepositoryImpl(){
		super();	
	}
	
	public void insertEmployee(Employee e) {
		super.save(e);
	}

	public void updateEmployee(Employee e) {
		super.merge(e);
	}

	public void deleteEmployee(int empno) {
		super.delete(Employee.class,empno);
	}

	public Employee selectEmployee(int empno) {
		return super.find(Employee.class,empno);
	}

	public List<Employee> selectEmployees() {		//jpql
		return super.findAll(Employee.class, "Employee");
	}
}
