import java.sql.*;

import entity.Department;
/*
  java.sql <-- Driver <-- specifications for jdbc
  
   com.mysql.cj.jdbc<-Driver <-- implementation by mysql
 */
public class SelectTest2 {

	public static void main(String[] args) {
			//1 load the driver
			System.out.println("Trying to load the driver...");
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
				//Class.forName("com.mysql.cj.jdbc.Driver");
				
			System.out.println("Driver loaded....");
			
			//2. acquire the connection		//DSN URL
									// mainPro subpro   ip       port  db    user    password
			System.out.println("Trying to connect to the database....");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root123");	
			System.out.println("Connected to the database...."+conn);

			
			//3. create the desired statement
			Statement st = conn.createStatement();
			System.out.println("Statement created .."+st);
			
			//4. execute the statement
			ResultSet result = 	st.executeQuery("select * from dept");
			System.out.println("Query created...and executed...");		
			//5. process the result if any
				while(result.next()) {
					Department deptObj = new Department(); // a blank object
					
					//populate values in the object | fillup the object
					deptObj.setDepartmentNumber(result.getInt(1));
					deptObj.setDepartmentName(result.getString(2));
					deptObj.setDepartmentLocation(result.getString(3));
					
					System.out.println(deptObj.getDepartmentNumber());
					System.out.println(deptObj.getDepartmentName());
					System.out.println(deptObj.getDepartmentLocation());
					System.out.println("----------");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			/*catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	}

}
