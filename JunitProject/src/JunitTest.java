import java.util.Iterator;

//import org.junit.Test; //junit4
import   org.junit.jupiter.api.Test; //junit5

import org.junit.jupiter.api.Assertions;

//developer --> tester --> deployer -> client
public class JunitTest {

		
		int ary[]= {10,20};
		
		
	
		
		

		@Test
		public void testCase1()
		{
			Assertions.assertTrue(ary!=null);
			System.out.println("Array is not null");
		}
		
		@Test
		public void testCase2()
		{
			Assertions.assertTrue(ary.length > 0 );
			System.out.println("array length is more than 0");
		}
		
		@Test
		public void testCase3()
		{
			System.out.println("iterating....");
			for (int i = 0; i < ary.length; i++) {
				System.out.println("ary "+ary[i]);
			}
		}		
		

}

