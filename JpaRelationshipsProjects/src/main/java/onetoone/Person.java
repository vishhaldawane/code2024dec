package onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/*
 * STD		DIV	ROLLNO
 * X		A	1
 * X		B	1
 * XI		A	1
 * XI 		B	1
 */
@Entity
public class Person {
	@Id
	@GeneratedValue 			//use SequenceGenerator for custom generated values 
	private Long   id; //101
	private String name;//Sakshi
	
	
	
	@OneToOne(
		mappedBy="person", 
		cascade = 
		CascadeType.ALL) //hasA
	private Passport passport;
	
	
	
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
/*
 * create table person
 * (
 *    number long primary key 
 
*/