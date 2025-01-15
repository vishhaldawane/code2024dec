import java.util.Scanner;
import java.util.stream.Stream;

//import Bhajiya.PotatoBhajiya;

public class Tester2 {
	public static void main(String[] args) {
		
		//Bhajiya.OnionBhajiya ob = new Bhajiya.OnionBhajiya();
		String str="none";
		
		do
		{
			System.out.println("What type of bhajiya you want ?");
			Scanner scan = new Scanner(System.in);
			str = scan.next(); 
			
			Bhajiya bhajiya = Bhajiya.of(str);
			if(bhajiya!=null)
				bhajiya.crispy();
			else
				System.out.println("No bhajiya selected...");
		} while(!str.equalsIgnoreCase("none"));
		
		//Bhajiya.PotatoBhajiya bhajiya = new Bhajiya.PotatoBhajiya();
		
		
		//Stream streasm = Stream.of(staff);
		
	}
}
interface Bhajiya 
{
	 void crispy();

	 static Bhajiya of(String hint) { //is not the instance method
		 Bhajiya ref = null;
		 if(hint.contains("mirchi"))
			 ref = new MirchiBhajiya();
		 else if(hint.contains("onion"))
			 ref = new OnionBhajiya();
		 else if(hint.contains("potato"))
			 ref = new PotatoBhajiya();
		 return ref;
	 }
	 
	 static class MirchiBhajiya implements Bhajiya
	 {
	 	public void crispy()
	 	{
	 		System.out.println("Mirchi bhajiya is spicy and crispy");
	 	}
	 }
	 static class OnionBhajiya implements Bhajiya
	 {
	 	public void crispy()
	 	{
	 		System.out.println("Onion bhajiya is tasty and crispy..tea is required");
	 	}
	 }
	 static class PotatoBhajiya implements Bhajiya
	 {
	 	public void crispy()
	 	{
	 		System.out.println("Potato bhajiya is delicious and crispy, yummy, with pao");
	 	}
	 }
}


