import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternTest {

	public static void main(String[] args) {
		
		System.out.println("Begin");
		//AMYPO4672A
		System.out.println("Enter your pan : ");
		Scanner scanner = new Scanner(System.in);
		
		String value = scanner.nextLine();
				
		if( value == null || value.isEmpty()) {
			System.out.println("String is null or empty");
		}
		else
		{
			if(Pattern.matches("^[A-Z]{5}[0-9]{4}[A-Z]$", value)) {
				System.out.println("Its a valid pan");
			}
			else {
				System.out.println("its invalid pan : "+value);
			}
		}
		
		
		System.out.println("End");
		

	}

}
