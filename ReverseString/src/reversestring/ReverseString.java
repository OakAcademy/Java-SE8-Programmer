package reversestring;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = scanner.nextLine();
		
		int length = string.length();
		
		String reversedString = "";
		
		//for loop
		for(int i = length - 1; i >= 0; i--) {
			
			//charAt()
			reversedString = reversedString + string.charAt(i);
			
		}
		
		System.out.println("Reversed String is: " + reversedString);
		
		scanner.close();

	}

}
