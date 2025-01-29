import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Employee;

public class JpaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		System.out.println("Entity Object created....");
		emp.setEmployeeNumber(7799);
		emp.setEmployeeName("Sachin K");
		emp.setEmployeeJob("Teacher");
		emp.setManagerCode(7839);//<--existing emp number
		emp.setEmployeeHiredate(Date.valueOf("2025-12-25"));
		emp.setSalary(4444);
		emp.setCommission(555);
		emp.setDeptNumber(10);
		System.out.println("Entity object is filled up with values...");
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created...");
		
		EntityManager entityManager = emf.createEntityManager();
		System.out.println("EntityManager created...");

		EntityTransaction trans = entityManager.getTransaction();
		System.out.println("EntityTransaction created....");
		
		trans.begin();
			System.out.println("EntityTransaction started.....");
			entityManager.persist(emp);
			System.out.println("Entity peristed onto the database");
		trans.commit();
			System.out.println("EntityTransaction committed...");
		
	}

}
