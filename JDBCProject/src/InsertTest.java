import java.sql.*;
import java.util.Scanner;
/*
  java.sql <-- Driver <-- specifications for jdbc
  
   com.mysql.cj.jdbc<-Driver <-- implementation by mysql
 */
public class InsertTest {

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
	PreparedStatement pst = 
		conn.prepareStatement(
			"insert into dept values (?,?,?)");
	
			System.out.println("PreparedStatement created .."+pst);
			
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			
			System.out.println("Enter new dept number : ");
			int newDeptNo = scan1.nextInt();
		
			System.out.println("Enter new dept name : ");
			String newDeptName = scan2.nextLine();
		
			System.out.println("Enter new dept location : ");
			String newDeptLoc = scan3.nextLine();
		
			pst.setInt(1, newDeptNo);//1st question mark is replaced with 50
			pst.setString(2, newDeptName); //2nd question mark replaced with QMS
			pst.setString(3, newDeptLoc);//third ? mark replaced with Mumbai
			
			//4. execute the statement
			int rowsInserted = 	pst.executeUpdate();
			System.out.println("Query fired..rows inserted : "+rowsInserted);		
			
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
