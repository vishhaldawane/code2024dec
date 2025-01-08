import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;
/*
	 
	 () -> {
		
	 }
	 
	 
	 Someone.otherFunction( ()-> { } );
	 							|
	 class Someone				+------+
	 {								   |
	 		static void otherFunction( x )
	 		{
	 			x(); //callback to you Lambda function
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
		
		System.out.println("--------------");

		//Consumer <-- type 
		//we are sending the lambda function [ function without name]
		//insde the forEach- and expecting a callback to your lambda
		//from the forEach
		
		primes.forEach( (n)-> {System.out.println(">>> Value : "+n);}  );
		
		Consumer<Integer> funName = (n)-> {
										System.out.println(">>> Value : "+n);
										System.out.println(">>> Value : "+n);
										System.out.println(">>> Value : "+n);
										System.out.println("--------");							
		}    ;
		
		System.out.println("--------------");
//2 3 5 7 11
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
