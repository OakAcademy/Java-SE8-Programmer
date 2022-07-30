package boxing;

public class AutoboxingUnboxing {

	public static void main(String[] args) {
		
		Double myDouble = 12.8;//auto-boxing of double
		double otherDouble = myDouble;//auto-unboxing of Double
		System.out.println(myDouble + " " + otherDouble);
		
		Integer myInteger = 5;//auto-boxing of int
		int myInt = myInteger;//auto-unboxing of Integer
		System.out.println(myInteger + " " + myInt);
		
		Character myCharacter = 'b';//auto-boxing of char
		char myChar = myCharacter;//auto-unboxing of Character
		System.out.println(myCharacter + " " + myChar);
		
		Integer myInteger2 = null;
		//int myInt2 = (Integer) null;
		
		int myInt2 = myInteger2;//null pointer exception

	}

}
