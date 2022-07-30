package datatype;

public class CharExample {

	public static void main(String[] args) {
		
		//char 0 - 65535
		char firstChar = 74;//J-->74 in decimal
		
		char secondChar = 49;//1-->49 in decimal
		
		System.out.println("firstChar = " + firstChar);
		System.out.println("is firstChar letter? " + Character.isLetter(firstChar));
		System.out.println("is firstChar digit? " + Character.isDigit(firstChar));
		
		System.out.println("secondChar = " + secondChar);
		System.out.println("is secondChar letter? " + Character.isLetter(secondChar));
		System.out.println("is secondChar digit? " + Character.isDigit(secondChar));
		
		char myLetter = 66;//66->B
		int number = myLetter + 2;//66+2=68-->D
		char myNewChar = (char) number;//68 to char -> D
		System.out.println("myNewChar = " + myNewChar);
		
		char char1 = 65;//A
		char char2 = char1++;//char2=65 --> A
		//char1 = 66 -> B
		boolean boolean1 = char2 == 'B';// A is not equal to B --> false
		boolean boolean2 = ++char1 == 67;// 67 == 67 --> true
		
		System.out.println(boolean1);
		System.out.println(boolean2);

	}

}
