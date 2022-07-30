package operator;

public class BitwiseBitShift {

	public static void main(String[] args) {

		// Bitwise AND Operator (&)
		int number1 = 10;// 1010
		int number2 = 13;// 1101
							// 1000 -> 8 in decimal

		System.out.println("-----------Bitwise AND Operator (&)-------------------");
		System.out.println("number1 in binary: " + Integer.toBinaryString(number1));
		System.out.println("number2 in binary: " + Integer.toBinaryString(number2));
		System.out.println("number1 & number2 in binary: " + Integer.toBinaryString(number1 & number2));
		System.out.println("number1 & number2 in decimal: " + (number1 & number2));

		// Bitwise OR Operator (|)
		int number3 = 10;// 1010
		int number4 = 13;// 1101
							// 1111 -> 15 in decimal

		System.out.println("-----------Bitwise OR Operator (|)-------------------");
		System.out.println("number3 in binary: " + Integer.toBinaryString(number3));
		System.out.println("number4 in binary: " + Integer.toBinaryString(number4));
		System.out.println("number3 | number4 in binary: " + Integer.toBinaryString(number3 | number4));
		System.out.println("number3 | number4 in decimal: " + (number3 | number4));

		// Bitwise Exclusive OR(XOR) Operator (^)
		int number5 = 10;// 1010
		int number6 = 13;// 1101
							// 0111 -> 7 in decimal

		System.out.println("-----------Bitwise Exclusive OR(XOR) Operator (^)-------------------");
		System.out.println("number5 in binary: " + Integer.toBinaryString(number5));
		System.out.println("number6 in binary: " + Integer.toBinaryString(number6));
		System.out.println("number5 ^ number6 in binary: " + Integer.toBinaryString(number5 ^ number6));
		System.out.println("number5 ^ number6 in decimal: " + (number5 ^ number6));

		// Signed Left Shift Operator (<<)
		int number7 = 10;// 1010 << 2 -->101000 --> 40 in decimal

		System.out.println("-----------Signed Left Shift Operator (<<)-------------------");
		System.out.println("number7 in binary: " + Integer.toBinaryString(number7));
		System.out.println("number7 << 2  in binary: " + Integer.toBinaryString(number7 << 2));
		System.out.println("number7 << 2  in decimal: " + (number7 << 2));

		// Signed Right Shift Operator (>>)
		int number8 = 10;// 1010 >> 2 -->10 --> 2 in decimal

		System.out.println("-----------Signed Right Shift Operator (>>)-------------------");
		System.out.println("number8 in binary: " + Integer.toBinaryString(number8));
		System.out.println("number8 >> 2  in binary: " + Integer.toBinaryString(number8 >> 2));
		System.out.println("number8 >> 2  in decimal: " + (number8 >> 2));

		// Unary Bitwise Complement Operator (~)
		int number9 = 10;// ~1010 --> 0101 --> 5 in decimal
		// 1111 1111 1111 1111 1111 1111 1111 0101 --> -11 --> 5-16 = -11

		System.out.println("-----------Unary Bitwise Complement Operator (~)-------------------");
		System.out.println("number9 in binary: " + Integer.toBinaryString(number9));
		System.out.println("~number9 in binary: " + Integer.toBinaryString(~number9));
		System.out.println("~number9 in decimal: " + (~number9));

		// Unary Bitwise Complement Operator (~)
		int number10 = 17;// ~00010001 --> 11101110 --> 238 in decimal
		// 0000 0000 0000 0000 0000 0000 0001 0001
		// 1111 1111 1111 1111 1111 1111 1110 1110 --> -18 --> 238-256 = -18

		System.out.println("-----------Unary Bitwise Complement Operator (~)-------------------");
		System.out.println("number10 in binary: " + Integer.toBinaryString(number10));
		System.out.println("~number10 in binary: " + Integer.toBinaryString(~number10));
		System.out.println("~number10 in decimal: " + (~number10));

	}

}
