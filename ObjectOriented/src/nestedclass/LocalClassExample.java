package nestedclass;

import java.util.Scanner;

public class LocalClassExample {
	
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a phone number: ");
		
		String userNumber = input.nextLine();
		validatePhoneNUmber(userNumber);
		input.close();
		

	}
	
	public static void validatePhoneNUmber(String phoneNUmber) {
		
		//Java 8 and later final is not required
		final int numberLength = 10;
		
		//local inner class
		class PhoneNumber{
			
			String validNumber = null;
			
			//constructor
			public PhoneNumber(String number) {
				
				if(number.length() == numberLength) {
					
					validNumber = number;
					
				}else {
					
					validNumber = null;
					
				}
				
			}
			
			//method
			public void printNumber() {
				
				//after Java 8 we can access directly method parameters
				System.out.println("You entered " + phoneNUmber);
				
			}
			
			
		}
		
		PhoneNumber myNumber = new PhoneNumber(phoneNUmber);
		
		myNumber.printNumber();
		
		if(myNumber.validNumber == null) {
			
			System.out.println("This number is invalid, the phone number must be 10 characters.");
			
		}else {
			
			System.out.println("This number is valid: " + myNumber.validNumber);
			
		}
		
	}

}
