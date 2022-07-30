package stringexample;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s1 = "Java Programming Language";
		String s2 = "Hello";
		String s3[];
		
		System.out.println("String: " + s1);
		System.out.println("The first character: " + s1.charAt(0));
		System.out.println("Length of String: " + s1.length());
		System.out.println("Substring: " + s1.substring(5));
		System.out.println("isEqual ? " + s1.equals(s2));
		System.out.println("isEmpty ? " + s1.isEmpty());
		System.out.println("concat: " + s2.concat(" " + s1));
		System.out.println("toUppercase: " + s1.toUpperCase());
		System.out.println("toLowercase: " + s1.toLowerCase());
		
		s3 = s1.split(" ");
		System.out.println("Split base space: " + Arrays.toString(s3));
		
		System.out.println("replace v with V: " + s1.replace('v', 'V'));

	}

}
