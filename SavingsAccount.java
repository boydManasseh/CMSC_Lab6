public class SavingsAccount extends BankAccount{
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	
	public SavingsAccount(String a, double b) {
		super(a,b);
		System.out.println(getAccountNumber()+ "-"+savingsNumber);
	}
	
	public SavingsAccount(SavingsAccount s,double b) {
		super(s,b);
		savingsNumber++;
		System.out.println(getAccountNumber()+ "-"+savingsNumber);
	}
	
	public void postInterest() {
		setBalance(getBalance()+(getBalance()*rate*0.0833));
	}
	
	public String getAccountNumber() {
		return super.getAccountNumber();
	}

}
