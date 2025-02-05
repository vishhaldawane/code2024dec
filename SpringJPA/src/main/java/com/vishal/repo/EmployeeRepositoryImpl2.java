package com.vishal.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.vishal.entity.Employee;

@Repository("impl2")
public class EmployeeRepositoryImpl2 implements EmployeeRepository {

	EntityManager manager; //null
	
	EmployeeRepositoryImpl2() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA"); 
		manager = factory.createEntityManager();
		System.out.println("EmployeeRepositoryImpl2() .....");
	}
	public List<Employee> getEmployees() {
		System.out.println("EmployeeRepositoryImpl2: getEmployee() invoked...");

		TypedQuery<Employee> query = manager.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

}


