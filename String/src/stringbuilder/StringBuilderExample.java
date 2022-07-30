package stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("Welcome to");
		builder.append(" Java");//mutable builder object
		//from now the builder object points out the "Welcome to Java"
		
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println(builder.insert(builder.length(), " World"));
		System.out.println(builder.reverse());//String class does not have the reverse method!!
		System.out.println(builder.reverse());//we will get the original value of the builder object
		System.out.println(builder.delete(0, 11));//delete first 11 characters
		
		
		//String vs StringBuilder
		String myString = new String("Hello");
		myString.concat(" Java");
		
		//myString is Hello, string is immutable
		String myString2 = myString.concat(" World");//myString2 --> Hello World
		
		//myString is still Hello
		
		System.out.println(myString);//Hello
		System.out.println(myString2);//Hello World
		
		System.out.println(myString == myString2);//false
		System.out.println(myString.equals(myString2));//false
		
		
		StringBuilder myBuilder = new StringBuilder("Hello");
		myBuilder.append(" Java");
		
		//new value of the myBuilder is Hello Java
		
		StringBuilder myBuilder2 = myBuilder.append(" World");
		
		//myBUilder2 is Hello Java World
		//myBuilder is Hello Java World because StringBUilder is mutable
		
		System.out.println(myBuilder);//Hello Java World
		System.out.println(myBuilder2);//Hello Java World
		
		System.out.println(myBuilder == myBuilder2);//true
		System.out.println(myBuilder.equals(myBuilder2));//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
