package onetoone;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Passport {	
	@Id
	@GeneratedValue
	private Long passportNumber; //123123123
	private String issuedBy;  //Govt Of India
	private LocalDate issuedDate; //2024-12-28
	
	@OneToOne
	@JoinColumn
	(name="person_id")
	private Person person; //invoking
	//the setter method of the
	//above field, means filling
	//up the foreign key value
	
	
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Long getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(Long passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	public LocalDate getIssuedDate() {
		return issuedDate;
	}
	public void setIssuedDate(LocalDate issuedDate) {
		this.issuedDate = issuedDate;
	}
	
	
}
