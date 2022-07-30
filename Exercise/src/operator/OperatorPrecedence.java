package operator;

public class OperatorPrecedence {

	public static void main(String[] args) {

		double result = 5 + 2 * 4;

		System.out.println("result = " + result);

		result = (5 + 2) * 4;
		System.out.println("result = " + result);

		result += 90 / 30 % 10 * 2 + -4;
		// 90/30->3
		// 3%10 ->3
		// 3*2 -> 6
		// 6 + -4 -> 2
		// result = result + 2 --> 28 + 2 --> 30

		System.out.println("result = " + result);

		int x = 8, y = 4, z = 2, sum = 0;
		sum = x + --y + --z;
		System.out.println("sum = " + sum);

	}

}
