
public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savAccObj1 = new SavingsAccount(101, "Shelly", 50000);
		savAccObj1.printSavingsAccount();
		//savAccObj1.accountBalance=999999;//error, cant access private
		
		savAccObj1.deposit(50001);
		savAccObj1.printSavingsAccount();

	}

}

class SavingsAccount
{
	int accountNumber; //FIELD of the object = global variables
	String accountHolder;
	private double accountBalance;
	
	//this. points to the current class's object's data
							//local variables
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	
	void printSavingsAccount()
	{
		System.out.println("acno   : "+accountNumber);
		System.out.println("acname : "+accountHolder);
		System.out.println("acbal  : "+accountBalance);
		System.out.println("------------------");
	}
	void deposit(double amountToDeposit) 
	{
		System.out.println("Depositing cash.."+amountToDeposit);
		if(amountToDeposit > 50000) {
			System.out.println("Cannot deposit, please provide income proof...");
		}
		else {
			accountBalance = accountBalance + amountToDeposit;
			System.out.println("Deposited "+amountToDeposit);
		}
	}
	void withdraw(double amountToWithdraw) 
	{
		System.out.println("Withdrawing cash.."+amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
	}
	
}
