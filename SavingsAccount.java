
public class SavingsAccount extends BankAccount {
	double interestRate;

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void applyInterest() {
		System.out.println("Applying Interest...");
		super.balance += super.balance * interestRate;
	}
}
