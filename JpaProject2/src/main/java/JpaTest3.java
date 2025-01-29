import java.sql.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Employee;

public class JpaTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = null;
		System.out.println("Entity Object ref created....");
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created...");
		
		EntityManager entityManager = emf.createEntityManager();
		System.out.println("EntityManager created...");

			System.out.println("EntityTransaction started.....");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter emp number to delete : ");
			int empToSearch = scanner.nextInt();
			EntityTransaction trans = entityManager.getTransaction();
			System.out.println("Transaction started...");
			
			trans.begin();
			
				emp = entityManager.find(Employee.class, empToSearch);
				
				if(emp!=null) {
					System.out.println("Employee Number : "+emp.getEmployeeNumber());
					System.out.println("Employee Name   : "+emp.getEmployeeName());
					System.out.println("Employee Job    : "+emp.getEmployeeJob());
					System.out.println("Employee MGR    : "+emp.getManagerCode());
					System.out.println("Employee Joining: "+emp.getEmployeeHiredate());
					System.out.println("Employee Salary : "+emp.getSalary());
					System.out.println("Employee Comm   : "+emp.getCommission());
					System.out.println("Employee Dept   : "+emp.getDeptNumber());
					entityManager.remove(emp);
					trans.commit();
				}
				else {
					System.out.println("Employee not found : "+empToSearch);
				}
		
		
	}

}
