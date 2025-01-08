import java.util.Scanner;

public class RegularExpression {
	public static void main(String[] args) {
		String name=null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter username (min 8 max 12) : ");
		name = scan.nextLine(); //name may have spaces now
		
		
		//email address
		//  a@b.c <-- valid email
		//  a@.c <-- invalid
		
		// a@b@c.com <-- invalid
		// a.b@c.com <-- valid
		
		// a.b@y.m.com <-- valid
		
		// a123.test@g.com <-- valid
		// a.test123@g.com <--valid
		
		//username,email and password
		
		if(name.equals("")) {
			System.out.println("String is blank");
		}
		else		  //begin new         SPACE    york          endwith
	//	if(name.matches("^    [a-zA-z]+   ([\\s]   [a-zA-Z]+)*    $")   ) { // 8 to 12
		if(name.matches("^[a-zA-z]+([\\s][a-zA-Z]+)?$")) {
//		if(name.matches("^[a-zA-z]+([\\s][a-zA-Z]\\w{1,3})*$")) {

			System.out.println("Valid name");
		}
		else {
			System.out.println("Invalid name");
		}
		
		System.out.println("name is ["+name+"]");
		/*
		 		^ begin with 
		 		$ end with
		 		[] --means a set of letters,numbers, or symbols
		 		[A-Za-z]
		 		+ possible letters
		 		\\s - SPACE
		 		* optional
 
		 */
		
		
	}
}
