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
		
		j.drinkIt(45,67);
		j.color();
		j.stirrIt();
		
		w.drinkIt(66,88);
		w.emotions();
		w.stirrIt();
		
		b.drinkIt(44,77);
		b.sour();
		b.stirrIt();
		
		Drinking d1 = new Juice();
		Drinking d2 = new Water();
		Drinking d3 = new ButterMilk();
		
		int ans1 = d1.drinkIt(44,77);
	//	d1.stirrIt();
		//d1.color(); //not possible
		
		int ans2 = d2.drinkIt(99,88);
	//	d2.stirrIt();
		//d2.emotions(); //invalid
		
		int ans3 = d3.drinkIt(33,44);
	//	d3.stirrIt();
		//d3.sour(); // invalid
		
		// now without writing an independent class
		// and without implementing an interface
		// we would like to develop an implementation
		//of Drinking!!!!! how ???? Lambda
		
		Drinking d4 = (x,y)->{
			System.out.println("Drinking Tea : "+(x+y));
			return x+y;
			}			;
			
		int ans4 = d4.drinkIt(50,60);//110
		
		d4 = (p,q)->{
			System.out.println("Drinking SugarCane Juice : "+(p*q));
			return p*q;
		};
			
		int ans5 = d4.drinkIt(30,40);//1200
		
		System.out.println("ans1 : "+ans1);
		System.out.println("ans2 : "+ans2);
		System.out.println("ans3 : "+ans3);
		System.out.println("ans4 : "+ans4);
		System.out.println("ans5 : "+ans5);
		
		
	}
	
	
}
class Coffee
{
	void drink() { //DEFINED - and only one DEFINITION
		System.out.println("Drinking only coffee...");
	}
}
/*
 An informative annotation type used to indicate that an interface type declaration is intended to be a functional interface as defined by the Java Language Specification. 
 
 Conceptually, a functional interface has exactly 
 one abstract method.

 Since default methods have an implementation, 
 they are not abstract. 
 
 If an interface declares an abstract method 
 overriding one of the public methods of java.lang.Object, 
 that also does not count toward the interface's 
 abstract method count since any implementation 
 of the interface will have an implementation 
 from java.lang.Object or elsewhere.

Note that instances of functional interfaces can be 
created with lambda expressions, 
method references, or constructor references.

If a type is annotated with this annotation type, 
compilers are required to generate an error 
message unless:

The type is an interface type and not an annotation type, 
enum, or class.
The annotated type satisfies the requirements 
of a functional interface.
However, the compiler will treat any interface 
meeting the definition of a functional interface 
as a functional interface regardless of whether 
or not a FunctionalInterface annotation is 
present on the interface declaration.


 */
@FunctionalInterface
interface Drinking
{
	int drinkIt(int i, int j); //by default public,abstract
	//void stirrIt();
}
class Juice implements Drinking
{
	public int drinkIt(int i, int j) {
		System.out.println("Drinking only Juice...");
		return i*j;

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
	public int drinkIt(int i, int j) {
		System.out.println("Drinking only Water...");
		return i*i*j*j;
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
	public int drinkIt(int i, int j) {
		System.out.println("Drinking only ButterMilk...");
		return i+i+j+j;
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
//pure partial contract of a class - words are worlds
interface MathActivity
{
	int expression(int x, int y); // pure abstract method
}
class Subtraction implements MathActivity
{
	public int expression(int i, int j) {
		return i-j;
	}
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