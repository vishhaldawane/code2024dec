import javax.management.RuntimeErrorException;

public class SavingsAccount {
	int accountNumber;
	String accountHolder;
	double accountBalance;
	public SavingsAccount(int accountNumber, String accountHolder, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		if(accountBalance < 0) {
			throw new RuntimeException("Opening balance cannot be negative...");
		}
		else
			this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder
				+ ", accountBalance=" + accountBalance + "]";
	}
	public void withdraw(double amt) {
		System.out.println("withdrawing...");
		if(amt < 0 ) {
			throw new RuntimeException("Withdraw amount cannot be in negative...");
		}
		else
			accountBalance -= amt;
		//accountBalance-=1;
	}
	public void deposit(double amt) {
		System.out.println("depositing...");
		accountBalance += amt;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
