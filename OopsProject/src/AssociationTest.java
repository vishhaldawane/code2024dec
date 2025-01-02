
public class AssociationTest {
	public static void main(String[] args) {
		System.out.println("begin main");
		
		Person personObjRef1 = new Person(24,"Julie",'F');
	
		personObjRef1.showPerson();
		

		System.out.println("---------------------");
		
		Student studentObjRef1 = new Student(27,"Peter",'M',34,"Bharathi Vidyapeeth","AI");
		studentObjRef1.showStudent();
		
		System.out.println("---------------------");

		Employee empObjRef1 = new Employee(29,"Pritam",'F',56,"Swami Vivekananda Polytechnic","ENTC",1234,"Cap Gemini","IT","Java Developer",30000);
		empObjRef1.showEmployee();
		
		System.out.println("end main");

		
	}
}

class Person //Object -- 11 functions
{
	private int age;
	private String name;
	private char gender;
	
	//jpl provides a ctor = default ctor = does no-thing()
	//ctor = same name as of the class
	//ctor do not have return type
	//they are invoked during object creation process
	//they are used to initialize the object's state
	
	Person()
	{
		super();
		System.out.println("Person() ctor invoked...");
	}

	public Person(int age, String name, char gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
	void showPerson()
	{
		System.out.println("Age    : "+age);
		System.out.println("Name   : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("--------------------------");
	}
	
	//2
}
class Student extends Person //is A
{
	private int rollNumber;
	private String collegeName;
	private String stream;
	
	Student()
	{
		super();
		System.out.println("Student() ctor invoked...");
	}

	public Student(int age, String name, char gender, int rollNumber, String collegeName, String stream) {
		super(age, name, gender); //explicit call to super class ctor from a ctor
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.stream = stream;
	}
	
	void showStudent()
	{
		super.showPerson();//explicit call to super class function from any function
		System.out.println("Roll   : "+rollNumber);
		System.out.println("College: "+collegeName);
		System.out.println("Stream : "+stream);
		System.out.println("--------------------------");
	}
	
	//3
}
class Employee extends Student // is A
{
	private int empNumber;
	private String companyName;
	private String departmentName;
	private String designation;
	private float salary;
	
	Employee()
	{
		super();// default first line of every constructor
		System.out.println("Employee() ctor invoked...");
	}
	//5

	public Employee(int age, String name, char gender, int rollNumber, String collegeName, String stream, int empNumber,
			String companyName, String departmentName, String designation, float salary) {
		super(age, name, gender, rollNumber, collegeName, stream);
		this.empNumber = empNumber;
		this.companyName = companyName;
		this.departmentName = departmentName;
		this.designation = designation;
		this.salary = salary;
	}
	
	void showEmployee()
	{
		super.showStudent();
		System.out.println("EmpNo  : "+empNumber);
		System.out.println("Company: "+companyName);
		System.out.println("Dept   : "+departmentName);
		System.out.println("Desg   : "+designation);
		System.out.println("Salary : "+salary);
		
		
	}
	
}

/*
 
  		Person personObjRef1 = new Person();

		stack							heap(free store)
  
  									FIELD AREA
  								age		name	gender
  								-------------------------
  								|		|		|		|
  								-------------------------
  								100
  								  |
  		+-------------------------+
  		|								METHOD AREA / FUNCTIONS
  		100<--value							
  personObjRef1							
  										Person(){}, Person(.,.,.,){}
  										showPerson(){}
  										
  										
  		
  								age		name	gender
  								-------------------------
  								|		|		|		|
  								-------------------------
  								200
  								  |
  		+-------------------------+
  		|						
  		200<--value						
  personObjRef2
  
  								age		name	gender
  								-------------------------
  								|		|		|		|
  								-------------------------
  								300
  								  |
  		+-------------------------+
  		|						
  		300<--value						
  personObjRef3
  
  								|----------------student-----------------------------|
  								|------person-----------|
  								age		name	gender		roll	college		stream
  								-------------------------------------------------------
  								|		|		|		|		|			|		   |
  								-------------------------------------------------------
  								400
  								  |
  		+-------------------------+
  		|						
  		400<--value						
  studentObjRef3
  
  
 */
