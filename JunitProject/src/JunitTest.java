import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Iterator;

//import org.junit.Test; //junit4
import   org.junit.jupiter.api.Test; //junit5
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

//developer --> tester --> deployer -> client
public class JunitTest {
	
		int ary[];
		
		@Test
		public void testException2()
		{
			assertDoesNotThrow(
					()-> {
						Integer.parseInt("100a");					
						System.out.println("String 100 is always converted to numeric 100");
						
				});
			System.out.println("doesNotThrow is passed...");
			//.
			//.
			//.
			
		}
		@Test
		public void testExceptions()
		{
			Exception exception = 
					assertThrows(NumberFormatException.class, 
							()-> {
								String str = "100";
								Integer.parseInt(str);
								System.out.println(str+ "is converted integer");
							}
						);
			String expectedMessage ="For input string";
			String actualMessage = exception.getMessage();
			
			assertTrue(actualMessage.contains(expectedMessage));
			//System.out.println("parsing is successfull...");

		}
		
		
		/*@BeforeEach
		public void testCase4() {
			ary = new int[5]; // load 5 in
			System.out.println("Array is created");
			ary[0] = 10;
			ary[1] = 20;
			System.out.println("array is initialized...");
			
			System.out.println("Before each test case ran....");
		}
		
		@AfterEach
		public void testCase5() {
			System.out.println("Array operation done..");
			ary[0] = 0;
			ary[1] = 0;
			System.out.println("array is filled with zero.....");
			
			System.out.println("Before each test case ran....");
		}*/
		
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

