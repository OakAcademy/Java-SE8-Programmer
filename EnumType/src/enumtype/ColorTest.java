package enumtype;

import java.util.Scanner;

public class ColorTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a color: ");
		String inputColor = scanner.next();
		
		try {
			Colors myColor = Colors.valueOf(inputColor.toUpperCase());
			
			switch(myColor) {
			
				case RED:
					System.out.println("You entered RED");
					break;
				case YELLOW:
					System.out.println("You entered YELLOW");
					break;
				case GREEN:
					System.out.println("You entered GREEN");
					break;
			
			}
		}catch (IllegalArgumentException e) {
			
			System.out.println("Please enter enum constant type [RED, YELLOW, GREEN]");
			
		}
		

	}

}
