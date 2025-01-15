import java.util.ArrayList;
import java.util.List;

public class LayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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







