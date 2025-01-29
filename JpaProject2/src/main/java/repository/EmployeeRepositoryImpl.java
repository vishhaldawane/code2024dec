package repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entity.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	EntityManager entityManager; //global handle
	
	EmployeeRepositoryImpl(){
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("MyJPA");
		entityManager = factory.createEntityManager();	
	}
	
	public void insertEmployee(Employee e) {
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.persist(e);
		trans.commit();
	}

	public void updateEmployee(Employee e) {
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			entityManager.merge(e);
		trans.commit();
	}

	public void deleteEmployee(int empno) {
		EntityTransaction trans = entityManager.getTransaction();
		trans.begin();
			Employee emp = entityManager.find(Employee.class,empno);
			entityManager.remove(emp);
		trans.commit();
	}

	public Employee selectEmployee(int empno) {
		
		return entityManager.find(Employee.class, empno);
	}

	public List<Employee> selectEmployees() {
		Query query = entityManager.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

}
