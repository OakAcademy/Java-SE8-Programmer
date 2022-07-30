package stringexample;

public class StringImmutable {

	public static void main(String[] args) {
		
		int number = 5;
		number++;
		System.out.println(number);
		
		String numberString = "5";
		
		System.out.println(System.identityHashCode(numberString));
		
		numberString = numberString.concat("5");
		
		System.out.println(System.identityHashCode(numberString));
		
		System.out.println(numberString);//numberString=5, not 55
		
		String name = "JAVA";
		String name2 = name.toLowerCase();
		System.out.println(name);//JAVA
		System.out.println(name2);//java

	}

}
