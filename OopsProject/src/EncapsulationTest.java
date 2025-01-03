
public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What is the object count ? "+SavingsAccount.getObjectCount());
		
		SavingsAccount savAccObj1 = new SavingsAccount(101, "Shelly", 50000);
		SavingsAccount savAccObj2 = new SavingsAccount(102, "Sandeeep", 60000);
		System.out.println("What is the object count ? "+SavingsAccount.getObjectCount());

	//	SavingsAccount.objectCount=90; //being private, main cannot set it
		
		SavingsAccount savAccObj3 = new SavingsAccount(103, "Sachin", 70000);

		System.out.println("What is the object count ? "+SavingsAccount.getObjectCount());

		SavingsAccount savAccObj4 = new SavingsAccount(104, "Sumit", 80000);
		SavingsAccount savAccObj5 = new SavingsAccount(105, "Divya", 90000);

		System.out.println("What is the object count ? "+SavingsAccount.getObjectCount());


	}

}
/*		why	what how
 * 
 * 				class's data			vs		object's data
 * 				|								|
 * 				rateOfInterest					acno,name,balance
 * 				|								|
 * 				static member			vs 		non-static members
 * 				|								|
 * 				shared across all				separate copy per object
 * 				the objects						|
 * 				|								|
 * 				can be referred via the			can be referred via the
 * 				class's name					object's reference
 * 
 * 
 * 				static method
 * 				- it is used to refer the other static methods or static data
 * 			
 */
class SavingsAccount
{
	//below 3 are object's data | FIELDS
	int accountNumber; //FIELD of the object = global variables
	String accountHolder;
	private double accountBalance;
	
	//the below variable is not belong to the object's data
	//rather it is the Class's data
	private static int objectCount;
	
	static int getObjectCount() {
		return objectCount;
	}
	
	//this. points to the current class's object's data
							//local variables
	
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		++objectCount;
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
/*



		stack							heap
		
		
						rateOfInterest
		
		
		
						 accountNumber	accountHolder	accountBalance	
						 +----------------------------------------------+
						 |				|				|				|
						 +----------------------------------------------+		
		+---------------> 100
		|
		100
		savAccObj1

					 	accountNumber	accountHolder	accountBalance	
						 +----------------------------------------------+
						 |				|				|				|
						 +----------------------------------------------+		
		+---------------> 200
		|
		200
		savAccObj2
		
						 accountNumber	accountHolder	accountBalance	
						 +----------------------------------------------+
						 |				|				|				|
						 +----------------------------------------------+		
		+---------------> 300
		|
		300
		savAccObj3
		
						 accountNumber	accountHolder	accountBalance	
						 +----------------------------------------------+
						 |				|				|				|
						 +----------------------------------------------+		
		+---------------> 400
		|
		400
		savAccObj4
		
						 accountNumber	accountHolder	accountBalance	
						 +----------------------------------------------+
						 |				|				|				|
						 +----------------------------------------------+		
		+---------------> 500
		|
		500
		savAccObj5
		
		

*/