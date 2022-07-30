package operator;

public class ArithmeticOperator {

	public static void main(String[] args) {

		double number1 = 8.4;
		double number2 = 4.2;
		double result = 0.0;
		
		result = number1 + number2;
		
		System.out.println("number1 + number2 = " + result);
		
		result = number1 - number2;
		
		System.out.println("number1 - number2 = " + result);
		
		result = number1 * number2;
		
		System.out.println("number1 * number2 = " + result);
		
		result = number1 / number2;
		
		System.out.println("number1 / number2 = " + result);
		
		result = number1 % number2;
		
		System.out.println("number1 % number2 = " + result);
		
		String firstString = "This is";
		String secondString = " a concatenated string";
		String thirdString = firstString + secondString;
		
		System.out.println("Third string = " + thirdString);
		
	}

}
