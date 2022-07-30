package lambdaexpressionexample;

import java.util.Scanner;

public class TestLambdaExpression {

	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("Please enter two numbers: ");
		
		int number1 = inputScanner.nextInt();
		int number2 = inputScanner.nextInt();
		
		System.out.print("Plese select an operator(+,-,*,/): ");
		
		char operator = inputScanner.next().charAt(0);
		
		showResult(number1, number2, operator, (x, y, z)->{
			
			double result = 0.0;
			
			switch(z) {
			
			case '+':
				result = x + y;
				break;
			case '-':
				result = x - y;
				break;
			case '*':
				result = x * y;
				break;
			case '/':
				result = x / y;
				break;
			default:
				System.out.println("Invalid operator");
				return;
			
			}
			
			System.out.println(x + " " + z + " " + y + " = " + result);
			inputScanner.close();
			
			
		});

	}
	
	public static void showResult(int number1, int number2, char operator, CanCalculate calculate) {
		
		calculate.canDoFourOperations(number1, number2, operator);
		
		
	}

}
