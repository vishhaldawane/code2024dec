import java.sql.*;
import java.util.Scanner;
/*
  java.sql <-- Driver <-- specifications for jdbc
  
   com.mysql.cj.jdbc<-Driver <-- implementation by mysql
 */
public class DeleteTest {

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

			Scanner scan1 = new Scanner(System.in);
			
			
			//3. create the desired statement
	PreparedStatement pst = 
		conn.prepareStatement(
			"delete from dept where deptno=?");
	
			System.out.println("PreparedStatement created .."+pst);
						
			System.out.println("Enter the dept number to delete : ");
			int existingDeptNo = scan1.nextInt();
		
			pst.setInt(1, existingDeptNo);//1st question mark is replaced with 50

			//4. execute the statement
			int rowsDeleted = 	pst.executeUpdate();
			System.out.println("Query fired..rows deleted : "+rowsDeleted);		
			
			pst.close();
			conn.close();
			
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
