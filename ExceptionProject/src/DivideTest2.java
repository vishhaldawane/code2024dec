import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTest2 {

	public static void main(String[] args) {
		System.out.println("begin main");
		
		while(true)
		{
			try
			{
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter numerator : ");
				int num = scan.nextInt();
	
				System.out.println("Enter denominator : ");
				int deno = scan.nextInt();
				
				System.out.println("num   : "+num);
				System.out.println("deno  : "+deno);
				
				System.out.println("Dividing "+num+" by "+deno);
				int division = num / deno;
				//10/0 -> JVM -> if (deno==0)
				// it will throw ArithmeticException's 
				//object else it will send it to the-> CPU
				System.out.println("division : "+division);
				System.out.println("====================");

			}
			catch(ArithmeticException e) 
			{
				System.out.println("Cannot divide by zero...");
	
			}
			catch(InputMismatchException e) 
			{
				System.out.println("pls supply numerics ...");
	
			}
			catch(RuntimeException e)
			{
				
			}
			catch(Exception e) {
				
			}
			
		}
		
		
	}

}

/*
 	void transfer(source,target,amt)
 	{
 			BL find target
 			if( target exists ) {
 				BL find source
 				if( source exists ) {
 					BL check balance
 					if( source bal > amt to transfer ) {
 						BL debit from source
 						BL credit to target
 						BL show success msg
 					}
 					else {
 						show insufficient balance at source
 					}
 				}
 				else {
 					show that source does not exists
 				}
 			}
 			else {
 				show that target does not exist
 			}
 		}	
 			
 			String
 			Exception handling
 			Lambda
 			Collection
 			
 			
 		1  2  3 4   5 	
 		30 31 2 3	6
 			
 		void transfer(source, target, amt)
 		{
 			
 			try
 			{
 			
	 			BL find target
	 			BL find source
	 			BL check balance
	 			BL debit from source - update query
	 			BL credit to target - update query
	 			BL show success msg
			}
			catch( if target not found)
			{
				 show that target does not exist
			}
			catch( if source not found)
			{
				 show that source does not exist
			}
			catch( if not suff bal in source )
			{
			 	show insufficient balance at source
			}
			catch(n/w error handler)
			{
			}
			
		}
		
	
					Object
						|
			----------------------------
					|isA
					Throwable
					|
		-------------------
		|			|
	  Error		Exception
					|  [ checked ]
			---------------------
			|					|
	RuntimeException		CarKeyNotFoundException
			| [ unchecked ]
		---------------------------
		| isA			|	|
		|				|NullPointerException
	ArithmeticException	|String str=null; sop(str.toUpperCase());
		10/0		IndexOutOfBoundsException
						|
			---------------------------
			|						|
	StringIndexOutOfBoundsException ArrayIndexOutOfBoundsException
		String str="India";			int ary[]={10,20,30}
		sop(str.charAt(10));		sop(ary[4]);
					
					
					
					
					
					
 			
 */
