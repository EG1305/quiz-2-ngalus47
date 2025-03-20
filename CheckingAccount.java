
public class CheckingAccount extends BankAccount {
	double overdraftLimit;

	public CheckingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
		super(accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.printf("Attempting to withdraw $%.2f...\n", amount);
		
		if(amount <= balance + overdraftLimit) {
			super.withdraw(amount);
			System.out.println("Withdrawl Successful!");
		}
		else {
			System.out.println("Error: You went over your Overdraft Limit");
		}
		
	}
	
	
}
