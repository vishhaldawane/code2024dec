
public class ThrowTest {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println("begin");
		sun();
		System.out.println("end");
		
	}

	public static void sun() throws Exception 
	{
		System.out.println("line1");
		System.out.println("line2");
		
		System.out.println("line3.1");
		moon();
		System.out.println("line3.2");

	}
	public static void moon() throws Exception 
	{
		if(40>100)
			throw new Exception("something2 happened...");

		System.out.println("line4");
		if(100>40)
			throw new Exception("something1 happened...");
		
		System.out.println("line5");
		
		System.out.println("line6");
	}
}
