
public class UserDefinedMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin main");
		add1();
		
		System.out.println("back to main....");
		
		add2(150,250); //actual argument
		System.out.println("back to main");
		
		int ans = add3(700,300);
		System.out.println("answer is "+ans);
		System.out.println("back to main again... ");
		
		int sum = add4();
		System.out.println("sum "+sum);
		
		System.out.println("end of main...");
	}
	
	//FIRST 
	public static void add1()
	{
		int x=100;
		int y=200;
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		int z= x+y;
		System.out.println("Addition is : "+z);
		
	}
	
	//SECOND				//formal argument
	public static void add2(int x, int y) { // definition / called route | method | function
		
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		int z = x + y;
		System.out.println("z : "+z);
		System.out.println("---------------------");
	}
	
	
	//THIRD				//formal argument
	public static int add3(int x, int y) { // definition / called route | method | function
		
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		int z = x + y;
	//This method "must return" a result of type int
		return z;
		
	}
	
	//FOURTH - without argument BUT with return
	public static int add4() {
		int p=90;
		int q=45;
		System.out.println("p "+p);
		System.out.println("q "+q);
		return p+q;
	}
	
	
	
	
	
	
	
	public static void gotoAmerica() {
		System.out.println("\tNow in america");
		gotoAustralia();
		System.out.println("\tBack to america...");
	}
	
	public static void gotoAustralia() {
		System.out.println("\t\tNow in Australia...");
		gotoIndia();
		System.out.println("\t\tBack to Australia.....");
	}
	
	public static void gotoIndia() {
		System.out.println("\t\t\tNow in India");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}











/*
 * 
 * 1 function without return and without argument
 * 2 function without return BUT with    argument
 * 3
 * 4
 * 
 function = it is used to perform a specific activity
 
 function syntax :
 
 			returnType	functionName(argument list)
 			{
 					code body
 					
 					
 					return statement if any
 			}
 four types of functions
 
  
  		
 */
class Cricketer
{
	void relax()
	{
		
	}
}