package bankaccount;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		Scanner inputScanner = new Scanner(System.in);
		int choice;
		
		do {
			
			System.out.println("-----BANK ACCOUNT MENU-----");
			System.out.println("1-Deposit");
			System.out.println("2-Withdraw");
			System.out.println("3-Show Current Balance");
			System.out.println("4-Press another key to exit");
			System.out.println("Select an option: ");
			
			choice = inputScanner.nextInt();
			
			switch(choice) {
			
				case 1:
					System.out.println("Deposit Amount: ");
					account.deposit(inputScanner.nextInt());
					break;
				case 2:
					System.out.println("Current Balance: " + account.getBalance());
					System.out.println("Withdraw Amount: ");
					try {
						account.withDraw(inputScanner.nextInt());
					} catch (InSufficientFundException e) {
					
						System.out.println(e.toString());
						
					}
					break;
				case 3:
					System.out.println("Current Balance: " + account.getBalance());
					break;
			
			}
			
			
		} while (choice >= 1 && choice <= 3);
		
		System.out.println("Bye...");

	}

}
