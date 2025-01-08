import java.util.ArrayList;
import java.util.function.Consumer;

class Z
{
	void fun() {
		Coffee c = new Coffee();
		c.drink();
		
		Juice j = new Juice();
		Water w = new Water();
		ButterMilk b = new ButterMilk();
		
		j.drinkIt();
		j.color();
		j.stirrIt();
		
		w.drinkIt();
		w.emotions();
		w.stirrIt();
		
		b.drinkIt();
		b.sour();
		b.stirrIt();
		
		Drinking d1 = new Juice();
		Drinking d2 = new Water();
		Drinking d3 = new ButterMilk();
		
		d1.drinkIt();
	//	d1.stirrIt();
		//d1.color(); //not possible
		
		d2.drinkIt();
	//	d2.stirrIt();
		//d2.emotions(); //invalid
		
		d3.drinkIt();
	//	d3.stirrIt();
		//d3.sour(); // invalid
		
		// now without writing an independent class
		// and without implementing an interface
		// we would like to develop an implementation
		//of Drinking!!!!! how ???? Lambda
		
		Drinking d4 = ()->{System.out.println("Drinking Tea");};
		d4.drinkIt();
		
		Drinking d5 = ()->{System.out.println("Drinking SugarCane Juice");};
		d5.drinkIt();
		
		
		
	}
	
	
}
class Coffee
{
	void drink() { //DEFINED - and only one DEFINITION
		System.out.println("Drinking only coffee...");
	}
}
@FunctionalInterface
interface Drinking
{
	void drinkIt();
	//void stirrIt();
}
class Juice implements Drinking
{
	public void drinkIt() {
		System.out.println("Drinking only Juice...");

	}
	void color() {
		System.out.println("Juice color is orange...");
	}
	
	public void stirrIt() {
		// TODO Auto-generated method stub
		
	}
}
class Water implements Drinking
{
	public void drinkIt() {
		System.out.println("Drinking only Water...");

	}
	void emotions() {
		System.out.println("Water has emotions...");
	}

	public void stirrIt() {
		// TODO Auto-generated method stub
		
	}
}
class ButterMilk implements Drinking
{
	public void drinkIt() {
		System.out.println("Drinking only ButterMilk...");

	}
	void sour( ) {
		System.out.println("ButterMilk is little sour...");
	}
	
	public void stirrIt() {
		// TODO Auto-generated method stub
		
	}
	
}






public class TestLambda2 {
	public static void main(String[] args) {
		
		Z z = new Z();
		z.fun();
		
		//1
		Addition addition = new Addition();
		int a1 = addition.expression(10, 20);
		System.out.println("Sum : "+a1);

		//2
		MathActivity activity1 = new Addition();
		int a2 = activity1.expression(10, 20);
		System.out.println("Sum : "+a2);

		
		System.out.println("-----------");
		
		Multiplication mult = new Multiplication();
		int p1 = mult.expression(10, 20);
		System.out.println("Product : "+p1);

		MathActivity activity2 = new Multiplication();
		int p2= activity2.expression(10, 20);
		System.out.println("Product : "+p2);
		
		System.out.println("-----------");

		/*
		 class Addition implements MathActivity
		 {	
			public int expression(int x, int y) {
				return x+y;
			}
		 } 
		 */
		MathActivity activity3 = (a, b) -> a + b ;
		MathActivity activity4 = (x, y) -> x - y ;
		MathActivity activity5 = (p, q) -> p * q ;
		MathActivity activity6 = (x, y) -> x / y ;

		System.out.println(" "+activity3.expression(10, 20));
		System.out.println(" "+activity4.expression(100, 20));
		System.out.println(" "+activity5.expression(10, 20));
		System.out.println(" "+activity6.expression(100, 20));
		
		ArrayList<Integer> listOfNums = new ArrayList<Integer>();
		listOfNums.add(50);
		listOfNums.add(63);
		listOfNums.add(75);
		listOfNums.add(82);
		listOfNums.add(85);
		listOfNums.add(35);
		listOfNums.add(83);
		
		
		//1st implementation
		Consumer<Integer> activity7 = (n) -> { System.out.println(n); };
		
		//2nd implementation
		Consumer<Integer> activity8 = (n) -> { 
			if(n%5==0)
				System.out.println(n); 
		};
		
		//3rd implementation
		Consumer<Integer> activity9 = (n) -> { 
			if(n%2==0)
				System.out.println(n); 
		};
		
		listOfNums.forEach(activity7);

		System.out.println("---------");

		
		listOfNums.forEach(activity8);
		
		System.out.println("---------");

		listOfNums.forEach(activity9);

	}
}

class X
{
	void fun() { }
}

class Y extends X
{
	@Override 
	void fun() { }
}



@FunctionalInterface
interface MathActivity
{
	int expression(int x, int y); // pure abstract method
	//int expr2(int i);
}
class Addition implements MathActivity
{
	public int expression(int x, int y) {
		return x+y;
	}
}

//for the sake of operation , we are writing an extra class
// with classname + implements interface + method body + code 

// to develop the implementation class
// class ClassName  implements InterfaceName
// {   public void methodName(){ } }
class Multiplication implements MathActivity
{
	public int expression(int x, int y) {
		return x*y;
	}
}