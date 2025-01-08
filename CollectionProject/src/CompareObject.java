// exclusive
// inherited
// overridden
// implemented

class Employee
{
	int employeeNumber;
	String employeeName;
	float employeeSalary;
	
	public boolean equals(Object obj) {
		System.out.println(this.hashCode()+" being compared with..."+obj.hashCode());
		System.out.println(this+" being compared with..."+obj);
		System.out.println("----------");
		return false;
	}
	public Employee(int employeeNumber, String employeeName, float employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
}
public class CompareObject {
	public static void main(String[] args) {
		Employee emp1 = new Employee(101,"Jack",50000);
		Employee emp2 = new Employee(101,"Jack",50000);
		
		if(emp1.equals(emp2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
			
	}
}
