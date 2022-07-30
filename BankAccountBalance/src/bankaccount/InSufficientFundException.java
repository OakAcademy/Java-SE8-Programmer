package bankaccount;

public class InSufficientFundException extends Exception {
	
	private String message;
	
	public InSufficientFundException(String message) {
		
		this.message = message;
		
	}

	//getter method of message
	public String getMessage() {
		return message;
	}
	
	

}
