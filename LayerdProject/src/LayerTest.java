import java.util.ArrayList;
import java.util.List;

public class LayerTest {

	public static void main(String[] args) {
		
	//	Person person = new Person();
	//	person.withdraw(5000);
		DepartmentServiceImpl deptService = new DepartmentServiceImpl();

		try {
			List<Department> deptList = deptService.getAllDepartments();
			for(Department dept : deptList)
			{
				System.out.println("DEPTNO : "+dept.getDepartmentNumber());
				System.out.println("DNAME  : "+dept.getDepartmentName());
				System.out.println("LOC    : "+dept.getDepartmentLocation());
				System.out.println("-------------");			
			}
			
		} catch (EmptyDepartmentListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		Department newDept = new Department();
		newDept.setDepartmentNumber(50);
		newDept.setDepartmentName("Test");
		newDept.setDepartmentLocation("Mahape");
		
		try {
			deptService.makeNewDepartment(newDept);
		} catch (DepartmentAlreadyExistException e) {
			e.printStackTrace();
		}
		
		try {
			List<Department> deptList = deptService.getAllDepartments();
			for(Department dept : deptList)
			{
				System.out.println("DEPTNO : "+dept.getDepartmentNumber());
				System.out.println("DNAME  : "+dept.getDepartmentName());
				System.out.println("LOC    : "+dept.getDepartmentLocation());
				System.out.println("-------------");			
			}
			
		} catch (EmptyDepartmentListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
		// TODO Auto-generated method stub
/*
		List<Department> deptList;
		
		DepartmentDAOImpl deptDAOImpl = new DepartmentDAOImpl();
		deptList = deptDAOImpl.readDepartments();
		
		for(Department dept : deptList)
		{
			System.out.println("DEPTNO : "+dept.getDepartmentNumber());
			System.out.println("DNAME  : "+dept.getDepartmentName());
			System.out.println("LOC    : "+dept.getDepartmentLocation());
			System.out.println("-------------");			
		}
		
		Department newDept = new Department();
		newDept.setDepartmentNumber(50);
		newDept.setDepartmentName("Test");
		newDept.setDepartmentLocation("Mahape");
		
		deptDAOImpl.createDepartment(newDept);
		System.out.println("==========after create===========");
		for(Department dept : deptList)
		{
			System.out.println("DEPTNO : "+dept.getDepartmentNumber());
			System.out.println("DNAME  : "+dept.getDepartmentName());
			System.out.println("LOC    : "+dept.getDepartmentLocation());
			System.out.println("-------------");			
		}
		
		Department deptToUpdate = new Department(50,"M1","MBP");
		deptDAOImpl.updateDepartment(deptToUpdate);
		
		System.out.println("==========after update===========");
		for(Department dept : deptList)
		{
			System.out.println("DEPTNO : "+dept.getDepartmentNumber());
			System.out.println("DNAME  : "+dept.getDepartmentName());
			System.out.println("LOC    : "+dept.getDepartmentLocation());
			System.out.println("-------------");			
		}
		
		deptDAOImpl.deleteDepartment(50);
		System.out.println("==========after delete===========");
		for(Department dept : deptList)
		{
			System.out.println("DEPTNO : "+dept.getDepartmentNumber());
			System.out.println("DNAME  : "+dept.getDepartmentName());
			System.out.println("LOC    : "+dept.getDepartmentLocation());
			System.out.println("-------------");			
		}
		
		Department deptFound = deptDAOImpl.readDepartment(30);
		System.out.println("==========after read===========");
		
			System.out.println("DEPTNO : "+deptFound.getDepartmentNumber());
			System.out.println("DNAME  : "+deptFound.getDepartmentName());
			System.out.println("LOC    : "+deptFound.getDepartmentLocation());
			System.out.println("-------------");			
	*/	
	}

}
//1. Table|DB is assumed
//2. Entity | Pojo | Component | bean 
class Department
{
	private int departmentNumber;
	private String departmentName;
	private String departmentLocation;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//we have a 3 parameterized ctor too, but dont forget to keep the no-arg ctor
	public Department(int departmentNumber, String departmentName, String departmentLocation) {
		super();
		this.departmentNumber = departmentNumber;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
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
//3. interface as per Pojo | interface Impl
interface DepartmentDAO
{
	//CRUD
	void createDepartment(Department dept); //C
	Department readDepartment(int deptno);  //R
	List<Department> readDepartments();     //RA
	void updateDepartment(Department dept); //U
	void deleteDepartment(int deptno);      //D

}
//Repository
class DepartmentDAOImpl implements DepartmentDAO
{
	List<Department> allDepts = new ArrayList<Department>();

	DepartmentDAOImpl() {
		Department dept1 = new Department(10,"Accounting","NY");
		Department dept2 = new Department(20,"Research","NJ");
		Department dept3 = new Department(30,"Sales","Chicago");
		Department dept4 = new Department(40,"Operations","Washington");

		
		allDepts.add(dept1);
		allDepts.add(dept2);
		allDepts.add(dept3);
		allDepts.add(dept4);
		
	}
	
	@Override
	public void createDepartment(Department newDept) {
		// TODO Auto-generated method stub
		allDepts.add(newDept);
	}

	@Override
	public Department readDepartment(int deptno) {
		// TODO Auto-generated method stub
		
		for(Department deptFound : allDepts)
		{
			if(deptFound.getDepartmentNumber() == deptno)
			{
				return deptFound;
			}
		}
		
		return null;
	}

	@Override
	public List<Department> readDepartments() {
		// TODO Auto-generated method stub
		return allDepts;
	}

	//10 Accounting NY
	//20 Research   NJ
	//30 Sales      Chicago
	//40 Operations Washington
	@Override						// 30 MKTG London
	public void updateDepartment(Department dept) {
		// TODO Auto-generated method stub
		for(Department deptFound : allDepts)
		{			//30						  30
			if(deptFound.getDepartmentNumber() == dept.getDepartmentNumber()) {
				allDepts.remove(deptFound);
				allDepts.add(dept);
				break;
				
				/*deptFound.setDepartmentName(dept.getDepartmentName());
				deptFound.setDepartmentLocation(dept.getDepartmentLocation());
				break;*/
			}
		}
	}

	@Override
	public void deleteDepartment(int deptno) {
		// TODO Auto-generated method stub
		for(Department deptFound : allDepts)
		{			//30						  30
			if(deptFound.getDepartmentNumber() == deptno) {
				allDepts.remove(deptFound);
				break;
			}
		}
		
	}
	
}
class DepartmentAlreadyExistException extends Exception
{
	DepartmentAlreadyExistException(String str) {
		super(str);
	}
}
class DepartmentNotFoundException extends RuntimeException
{
	DepartmentNotFoundException(String str) {
		super(str);
	}
}
class EmptyDepartmentListException extends Exception
{
	EmptyDepartmentListException(String str){
		super(str);
	}
}
/*------------ service layer begins ----------*/

interface DepartmentService
{
	void makeNewDepartment(Department dept) throws DepartmentAlreadyExistException; //C
	Department findSingleDepartment(int deptno) throws DepartmentNotFoundException;  //R
	List<Department> getAllDepartments() throws EmptyDepartmentListException;     //RA
	void modifyDepartment(Department dept) throws DepartmentNotFoundException; //U
	void removeDepartment(int deptno) throws DepartmentNotFoundException;      //D
}
class DepartmentServiceImpl implements DepartmentService
{
	DepartmentDAOImpl deptDAO = new DepartmentDAOImpl();
	
	@Override
	public void makeNewDepartment(Department dept) throws DepartmentAlreadyExistException {
		System.out.println("makeNewDepartment() invoked...");
		for(Department deptFound : deptDAO.readDepartments())
		{
			if(deptFound.getDepartmentNumber() 
					== dept.getDepartmentNumber()) {
				throw new DepartmentAlreadyExistException("This department already exists : "+dept.getDepartmentNumber());
			}
		}
		deptDAO.createDepartment(dept);	
	}

	
	
	
	
	
	
	@Override
	public Department findSingleDepartment(int deptno) throws DepartmentNotFoundException {
		boolean found=false;
		Department deptToReturn = null;
		for(Department deptFound : deptDAO.readDepartments())
		{
			if(deptFound.getDepartmentNumber() 
					== deptno) {
				found =true;
				deptToReturn = deptFound;
				break;
			}
		}
		if(found == true)
			return deptToReturn;
		else
			throw new DepartmentNotFoundException("Department with thid id does not exist : "+deptno);
	}

	@Override
	public List<Department> getAllDepartments() throws EmptyDepartmentListException {
		// TODO Auto-generated method stub
		if(deptDAO.readDepartments().size() > 0)
			return deptDAO.readDepartments();
		else
			throw new EmptyDepartmentListException("Department list is empty...");
	}
	

	@Override
	public void modifyDepartment(Department dept) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		boolean found=false;
		for(Department deptFound : deptDAO.readDepartments())
		{
			if(deptFound.getDepartmentNumber() 
					== dept.getDepartmentNumber()) {
				deptDAO.updateDepartment(dept);
				found = true;
				break;
			}
		}		
		if(found == false) {
			throw new DepartmentNotFoundException("Department with thid id does not exist : "+dept.getDepartmentNumber());
		}
	}
	

	@Override
	public void removeDepartment(int deptno) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		boolean found=false;
		for(Department deptFound : deptDAO.readDepartments())
		{
			if(deptFound.getDepartmentNumber() 
					== deptno) {
				deptDAO.deleteDepartment(deptno);
				found = true;
				break;
			}
		}		
		if(found == false) {
			throw new DepartmentNotFoundException("Department with thid id does not exist : "+deptno);
		}
	}
	
}
/*---------------*/
class SavingsAccount
{
	float balance;
	
	public SavingsAccount(float balance) {
		super();
		this.balance = balance;
	}

	void withdraw(float amt)
	{
		System.out.println("\t\t\tSelect query fired..");
		System.out.println("\t\t\tSavingsAccount : withdraw(float)");
		balance = balance  - amt;
		System.out.println("\t\t\tUpdate query fired...");
	}
}
class AtmServer
{
	SavingsAccount sa = new SavingsAccount(50000);
	
	void withdraw(float amt) {
		System.out.println("\t\tAtmServer : withdraw(float)");
		System.out.println("\t\tVerify the secured layer");
		System.out.println("\t\tStart the transaction");
		sa.withdraw(amt);
		System.out.println("\t\tComplete the transaction");
		System.out.println("\t\tRelease the secured layer");
		
	}
}
/*--------------------------------------*/
class AtmClient
{
	AtmServer atmServer = new AtmServer();
	
	void withdraw(float amt) {
		System.out.println("\tAtmClient : withdraw(float)");
		System.out.println("\tAtmClient : Enter pin");
		System.out.println("\tAtmClient : Select Account Type");
		System.out.println("\tAtmClient : Do you want reciept?");
		atmServer.withdraw(amt);
		System.out.println("\tAtmClient : reciept is printed...");
		System.out.println("\tAtmClient : card is unlocked");
	}
}
class Person
{
	AtmClient atm = new AtmClient();
	
	void withdraw(float amt) {
		System.out.println("Person : withdraw(float)");
		System.out.println("Person : entering the atm...");
		atm.withdraw(amt);
		System.out.println("Person : exiting from the atm ...");
	}
}








