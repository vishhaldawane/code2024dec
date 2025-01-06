import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionHandlingTest {
	public static void main(String[] args) {
		System.out.println("Begin");
		//checked 
		//unchecked
		int a=100; int b=20;
		try
		{
			FileInputStream fin = new FileInputStream("/Users/apple/cg2024dec/Day1.txt");
			System.out.println("File is ready..");
			int num=a/b;
			System.out.println("division "+num);
		
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not present.");
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant divide by zero...");
		}
		
		System.out.println("End");
	}
}
