package entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/*What is a component | bean | pojo | entity
 * 1. public class
 * 2. private data structure
 * 3. public no-arg constructor
 * 4. setters and getters
 * */

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@Column(name="empno") //emp_no
	private int employeeNumber;
	
	@Column(name="ename")
	private String employeeName;
	
	@Column(name="job")
	private String employeeJob;
	
	@Column(name="mgr")
	private Integer managerCode;
	
	@Column(name="hiredate")
	private Date employeeHiredate;
	
	@Column(name="sal")
	private Integer salary;
	
	@Column(name="comm")
	private Integer commission;
	
	@Column(name="deptno")
	private Integer deptNumber;

	
	
	public Employee() {
		super();
		System.out.println("Employee() ctor invoked...");
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeJob() {
		return employeeJob;
	}

	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}

	public Integer getManagerCode() {
		return managerCode;
	}

	public void setManagerCode(Integer managerCode) {
		this.managerCode = managerCode;
	}

	public Date getEmployeeHiredate() {
		return employeeHiredate;
	}

	public void setEmployeeHiredate(Date employeeHiredate) {
		this.employeeHiredate = employeeHiredate;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getCommission() {
		return commission;
	}

	public void setCommission(Integer commission) {
		this.commission = commission;
	}

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}
	
	
	
}
