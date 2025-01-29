import java.sql.Date;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.build.AllowSysOut;

import entity.Employee;

public class JpaTest4 {

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
			Scanner scanner2 = new Scanner(System.in);
			Scanner scanner3 = new Scanner(System.in);

			
			System.out.println("Enter emp number to modify : ");
			int empToSearch = scanner.nextInt();
			EntityTransaction trans = entityManager.getTransaction();
			System.out.println("Transaction started...");
			
			trans.begin();
			
			//attached object
				emp = entityManager.find(Employee.class, empToSearch);
				
				if(emp!=null) {
					System.out.println(" --- current details are --- ");

					System.out.println("Employee Number : "+emp.getEmployeeNumber());
					System.out.println("Employee Name   : "+emp.getEmployeeName());
					System.out.println("Employee Job    : "+emp.getEmployeeJob());
					System.out.println("Employee MGR    : "+emp.getManagerCode());
					System.out.println("Employee Joining: "+emp.getEmployeeHiredate());
					System.out.println("Employee Salary : "+emp.getSalary());
					System.out.println("Employee Comm   : "+emp.getCommission());
					System.out.println("Employee Dept   : "+emp.getDeptNumber());
					
					System.out.println(" --- enter NEW details below --- ");
					System.out.println("Enter new job ");
					String newJob = scanner2.next();
					
					System.out.println("Enter new salary ");
					int newSal = scanner3.nextInt();
					
					emp.setEmployeeJob(newJob);
					emp.setSalary(newSal);
					

					entityManager.merge(emp);
					
					trans.commit();
				}
				else {
					System.out.println("Employee not found : "+empToSearch);
				}
		
		
	}

}
