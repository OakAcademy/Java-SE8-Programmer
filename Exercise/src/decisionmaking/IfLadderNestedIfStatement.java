package decisionmaking;

import java.util.Scanner;

public class IfLadderNestedIfStatement {

	public static void main(String[] args) {

//		Scanner age = new Scanner(System.in);
//		System.out.println("Please enter your age:");
//		int yourAge = age.nextInt();
//		
//		if(yourAge < 13) {
//			System.out.println("You are a child");
//		}else if(yourAge < 19) {
//			System.out.println("You are a teenager");
//		}else {
//			
//			if (yourAge < 65) {
//				System.out.println("You are an adult.");
//			}else {
//				System.out.println("You are a senior.");
//			}
//			
//			
//		}
//		
//		age.close();

		Scanner number = new Scanner(System.in);
		int number1, number2, number3, largestNumber;
		System.out.println("This app finds the largest number\nPlease enter the first number:");
		number1 = number.nextInt();

		System.out.println("Please enter the second number:");
		number2 = number.nextInt();

		System.out.println("Please enter the third number:");
		number3 = number.nextInt();

		if ((number1 == number2) && (number1 == number3)) {
			System.out.println("All numbers are the same");
		} else {
			if (number1 > number2) {

				if (number1 > number3) {

					largestNumber = number1;
					System.out.println("The largest number = " + number1);

				} else if (number1 == number3) {
					System.out.println(number1 + " and " + number3 + " are equal and they are largest numbers");
				} else {
					largestNumber = number3;
					System.out.println("The largest number = " + number3);
				}

			} else if ((number1 == number2) && (number1 > number3)) {
				System.out.println(number1 + " and " + number2 + " are equal and they are largest numbers.");
			} else {

				if (number2 > number3) {
					largestNumber = number2;
					System.out.println("The largest number = " + number2);
				} else if (number2 == number3) {

					System.out.println(number2 + " and " + number3 + " are equal and they are largest numbers");

				} else {

					largestNumber = number3;
					System.out.println("The largest number = " + number3);

				}

			}

		}

	}

}
