import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.internal.build.AllowSysOut;

import entity.Employee;

public class JpaTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Entity Object ref created....");
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created...");
		
		EntityManager entityManager = emf.createEntityManager();
		System.out.println("EntityManager created...");

			System.out.println("EntityTransaction started.....");
				
				
									//jpql
			Query query = entityManager.createQuery("from Employee", Employee.class);
			
			List<Employee> allEmps = query.getResultList();
			
				for(Employee emp : allEmps) {
					System.out.println("Employee Number : "+emp.getEmployeeNumber());
					System.out.println("Employee Name   : "+emp.getEmployeeName());
					System.out.println("Employee Job    : "+emp.getEmployeeJob());
					System.out.println("Employee MGR    : "+emp.getManagerCode());
					System.out.println("Employee Joining: "+emp.getEmployeeHiredate());
					System.out.println("Employee Salary : "+emp.getSalary());
					System.out.println("Employee Comm   : "+emp.getCommission());
					System.out.println("Employee Dept   : "+emp.getDeptNumber());
					System.out.println("-------------");
				}	
						
	}

}
