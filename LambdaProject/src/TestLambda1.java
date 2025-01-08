import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;


interface Cleaning
{
	void clean();
}
class HouseCleaning implements Cleaning
{
	public void clean() //impl1
	{
		//code to define house cleaning
	}
}
class OfficeCleaning implements Cleaning
{
	public void clean() //impl2
	{
		//code to define office cleaning
	}
}












/*
  
  
  	 () ->
  	{
  	
  	}
 
 functionName(); <-- invocation
 
 ----------------------
	 () -> {
		
	 }
	 Someone.otherFunction( ()-> { } );
	 Someone.otherFunction( ()-> { } );
	 Someone.otherFunction( ()-> { } );
	 Someone.otherFunction( ()-> { } );
	 							|
	 class Someone				+------+
	 {								   |
	 		static void otherFunction( x )
	 		{
	 			x(); //callback to you Lambda function
	 		}
	 }
	 
	 Girl girl = new Girl();
	 girl.setName("seema");
	 
	 girl.talk();
	 
	 class Girl
	 {
	 	String name;
	 		void talk()
	 		{
	 			sop(name);
	 		}
	 }
	 
	 ArrayList primes = new ArrayList();
	 primes.add(2); . .. .. .. .. 3 5 7 11 13
	 
	 primes.forEach();
	 
	 class ArrayList
	 {
	 		void forEach( y )
	 		{
	 		
	 		}
	 }
*/
public class TestLambda1 {
	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		primes.add(11);
		
		//1. show the primes
		
		Iterator<Integer> priIte = primes.iterator(); //1
		while(priIte.hasNext()) { //2
			int x = priIte.next(); //3
			System.out.println("> Value : "+x);
		}
		System.out.println("--------------");
		//2. show the primes
		for(int x : primes ) {
			System.out.println(">> Value : "+x);

		}
		/*
		 	float ( i,  j,  k)
		 	{
		 		return (i+j+k)/3.0f;
		 	}
		*/
		System.out.println("--------------");

		//Consumer <-- type 
		//we are sending the lambda function [ function without name]
		//inside the forEach- and expecting a callback to your lambda
		//from the forEach
		
		primes.forEach( 
			(val) -> {
				System.out.println(">>> Value : "+val);
			}  
		);
		/*--------------------------*/
		Consumer<Integer> funName = 
				
			(val)-> {
				System.out.println(">>> Value : "+val);
			} 
		;
		System.out.println("--------------");
		primes.forEach(funName);
		
		funName = 
				
				(val)-> {
					System.out.println(">>> Value : "+(val*val));
				} 
			;
		
		primes.forEach(funName);


	}
}
//Rose 
//Flower
// ()-> { }
/*
class ArrayListss
{
	
	void forEach( Consumer c )
	{
		//c is being used to invoke the lambda that is recieved 
	}
	
}*/
