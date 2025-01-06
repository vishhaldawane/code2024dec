
public class DivideTest {

	public static void main(String[] args) {
		System.out.println("begin main");
		
		int num = 10;
		int deno = 0;
		
		System.out.println("num   : "+num);
		System.out.println("deno  : "+deno);
		
		if(deno != 0 ) { // BUSINESS LOGIC
			System.out.println("Dividing "+num+" by "+deno);
			int division = num / deno;
			System.out.println("division : "+division);

		}
		else { //ERROR LOGIC
			System.out.println("Cannot divide by zero...");
		}
		
		
		System.out.println("end main");
		
		
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
					|
					Throwable
					|
				 Exception
					|  [ checked ]
			---------------------
			|
	RuntimeException
			| [ unchecked ] 		
					
					
					
					
					
					
					
					
					
 			
 */
