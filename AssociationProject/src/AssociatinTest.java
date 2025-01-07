
public class AssociatinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount baAccObj1 ; //null reference
		
		baAccObj1 = new BankAccount(101,"Jack",50000);
		
		baAccObj1.showBankAccount();
		
		BankAccount baAccObj2  ;
		
		baAccObj2 = baAccObj1;
		
		baAccObj2.showBankAccount();
		
		System.out.println("baAccObj1 : "+baAccObj1);
		System.out.println("baAccObj2 : "+baAccObj2);
		
		baAccObj1.setBalance(60000);
		
		baAccObj1.showBankAccount();
		baAccObj2.showBankAccount();

		baAccObj2.setBalance(70000);

		baAccObj1.showBankAccount();
		baAccObj2.showBankAccount();

		sun(baAccObj1); // passing object as parameter
		
		baAccObj1.showBankAccount();
		baAccObj2.showBankAccount();
		
	}
						//bankAccObj3 = bankAccObj1
	public static void sun(BankAccount baAccObj3)
	{
		System.out.println("---- sun is invoked...");
		System.out.println("baAccObj3 : "+baAccObj3);
		baAccObj3.showBankAccount();
		baAccObj3.setBalance(90000);
		System.out.println("---- sun is over...");
	}
}
class BankAccount
{
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
	}
	
	void showBankAccount()
	{
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Name    : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("---------------------");
	}
	
	void setBalance(double newBalance) {
		System.out.println("Setting new balance....");
		this.accountBalance = newBalance;
	}
	
}
/*
		isA		hasA		usesA		producesA
		
		Passing object as parameter to the method
		
		

*/