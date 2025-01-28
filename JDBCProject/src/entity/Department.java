package entity;

//identical to the structure
//of the dept table
public class Department {

	//below is the primary key kind of
	private int departmentNumber;
	
	private String departmentName;
	private String departmentLocation;
	
	
	
	public Department() {
		super();
		System.out.println("Department() ctor....");
	}
	
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
	
	
}
