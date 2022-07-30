package datatype;

public class HexOctalBinary {

	public static void main(String[] args) {
		
		//Octal -> 0-7
		int myOctal1 = 016;//stores 14
		
		int myOctal2 = 0205;//stores 133
		
		int sumOfOctals = myOctal1 + myOctal2; //prints 147 -> 14 + 133
		
		System.out.println("*********OCTAL*************");
		System.out.println("myOctal1 = " + myOctal1);
		System.out.println("myOctal2 = " + myOctal2);
		System.out.println("sumOfOctals as Int = " + sumOfOctals);
		
		System.out.println("sumOfOctals as Octal = " + Integer.toOctalString(sumOfOctals));
		
		
		//Hexadecimal
		
		int myHex1 = 0x01E;//store 30
		
		int myHex2 = 0XA2;//prints the 162
		
		int sumOFHex = myHex1 + myHex2;//30 + 162 = 192
		
		System.out.println("*********Hexadecimal*************");
		System.out.println("myHex1 = " + myHex1);
		System.out.println("myHex2 = " + myHex2);
		System.out.println("sumOFHex as Int = " + sumOFHex);
		
		System.out.println("sumOFHex as Hex. = " + Integer.toHexString(sumOFHex));
		
		//Binary
		int myBinary1 = 0b0101;//store 5
		int myBinary2 = 0b1101;//prints 13
		
		int sumOfBinary = myBinary1 + myBinary2;//prints 18
		
		System.out.println("*********Binary*************");
		System.out.println("myBinary1 = " + myBinary1);
		System.out.println("myBinary2 = " + myBinary2);
		System.out.println("sumOfBinary as Int = " + sumOfBinary);
		
		System.out.println("sumOfBinary as Binary = " + Integer.toBinaryString(sumOfBinary));

	}

}
