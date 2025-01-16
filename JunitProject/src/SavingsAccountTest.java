import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {

	
	/*public static void main(String[] args) 
	{
		double currentBalance=50000;
		double amountToWithdraw=4000;
		double expectedBalance = currentBalance - amountToWithdraw;
		SavingsAccount sa = new SavingsAccount(101,"Jack",currentBalance);
		sa.withdraw(amountToWithdraw);
		if(sa.getAccountBalance() == expectedBalance) {
			System.out.println("withdraw success");
		}
		else {
			throw new RuntimeException("Expected balance is <"+expectedBalance+">, But found : <"+sa.getAccountBalance()+">");
		}
	}*/
	
	//aftereach
	//beforeeach
	//setup
	
	@Test
	public void testWithdraw() 
	{
		double currentBalance=50000;
		double amountToWithdraw=4000;
		double expectedBalance = currentBalance - amountToWithdraw;
		SavingsAccount sa = new SavingsAccount(101,"Jack",currentBalance);
		System.out.println("Object created....");
		
		Assertions.assertTrue(sa!=null);
		
		sa.withdraw(amountToWithdraw);
		System.out.println("withdraw executed...");
		
		Assertions.assertEquals(expectedBalance, sa.getAccountBalance());
		System.out.println("test case passed...");
	}
}
