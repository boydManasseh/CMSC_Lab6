
public class CheckingAccount extends BankAccount{
	
	private static final double FEE = 15;
	
	public CheckingAccount(String a, double b) {
		super(a,b);
		setAccountNumber(getAccountNumber() + "-10");
	}
	
	public boolean withdraw(double amount) {
		
		return super.withdraw(amount + FEE);
	}
	

}
