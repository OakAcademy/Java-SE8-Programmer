package operator;

public class ConditionalOperator {

	public static void main(String[] args) {

		int number1 = 6, number2 = 8, number3 = 12;
		boolean result;//default is false
		
		//Conditional AND Operator(&&)
		result = (number1 > number2) && (number3 > number1);
		System.out.println("Result = " + result);
		
		//Conditional OR operator (||)
		result = (number1 > number2) || (number3 > number2);
		System.out.println("Result = " + result);
		
		//Ternary Operator
		result = number1<number2 ? true : false;
		System.out.println("Result = " + result);
		
	}

}
