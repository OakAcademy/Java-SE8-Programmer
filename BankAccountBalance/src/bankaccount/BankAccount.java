package bankaccount;

public class BankAccount {
	
	double balance;
	
	public BankAccount() {
		
		balance = 0.0;
		
	}
	
	public void deposit(double amount) {
		
		balance = balance + amount;
		
	}
	
	public void withDraw(double amount) throws InSufficientFundException {
		
		if(amount > balance) {
			
			throw new InSufficientFundException("Insufficient Balance. Withdraw process couldn't be completed");
			
		}
		
		balance = balance - amount;
		
	}

	//getter method of balance
	public double getBalance() {
		return balance;
	}
	
	
	

}
