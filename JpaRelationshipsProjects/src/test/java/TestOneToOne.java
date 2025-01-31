import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import onetoone.Passport;
import onetoone.Person;

public class TestOneToOne {

	EntityManager manager;
	
	@BeforeEach()
	public void setUp() 
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("Entity Manager Factory created");
		manager = factory.createEntityManager();
		System.out.println("Entity Manager created");		
	}
	
	@Test
	public void testAddPersonWithoutPassport() {
		Person person = new Person();
		person.setName("JIM");
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
			manager.persist(person);
		trans.commit();
	}
	@Test
	public void testAddPassportWithoutPerson() {
		Passport passport = new Passport();
		passport.setIssuedBy("Govt.Of India");
		passport.setIssuedDate(LocalDate.of(2025, 10, 25));		
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
			manager.persist(passport);
		trans.commit();
	}
	
	@Test
	public void testAddPersonAlongWithPassport() {
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
			Person person = new Person();
			person.setName("JANE");
			manager.persist(person); //STORE IT
			
			Passport passport = new Passport();
				passport.setIssuedBy("Govt.Of Nepal");
				passport.setIssuedDate(LocalDate.of(2024, 9, 20));		
		
				passport.setPerson(person); //set the FK value
				manager.persist(passport);//STORE IT
		trans.commit();
	}
	
	
	@Test
	public void testReadPerson()
	{
		Person retrievedPerson = 
				manager.find(Person.class, 4L);
		
		Assertions.assertTrue(retrievedPerson!=null);
		System.out.println("Person id   : "+retrievedPerson.getId());
		System.out.println("Person Name : "+retrievedPerson.getName());
		System.out.println("------------");
		
		Passport passport = retrievedPerson.getPassport();
		
		System.out.println("Passport Number : "+passport.getPassportNumber());
		System.out.println("Passport Issued : "+passport.getIssuedBy());
		System.out.println("Passport Date   : "+passport.getIssuedDate());
		System.out.println("Passport Person : "+passport.getPerson().getName());
				
		
		
	}
	
	@Test
	public void testReadPassport()
	{
		Passport retrievedPassport = 
				manager.find(Passport.class, 5L);
		Assertions.assertTrue(retrievedPassport!=null);

		System.out.println("Passport Number : "+retrievedPassport.getPassportNumber());
		System.out.println("Passport Issued : "+retrievedPassport.getIssuedBy());
		System.out.println("Passport Date   : "+retrievedPassport.getIssuedDate());
		
		Person person = retrievedPassport.getPerson();
				
		System.out.println("---PERSON---");
		System.out.println("Person id       : "+person.getId());
		System.out.println("Person Name     : "+person.getName());
		System.out.println("Passport Issued : "+person.getPassport().getPerson());
		System.out.println("------------");
		
				
		
		
	}
	
}
