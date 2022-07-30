package stringexample;

import java.util.Arrays;

public class StringEquality {

	public static void main(String[] args) {

		/*
		String str1 = new String("Java Programming");
		String str2 = new String("Java Programming");
		String str3 = "Java Programming";
		String str4 = "Java Programming";
		String str5 = "Java" + " Programming";
		String str6 = str1;// str1 == str6 is true

		System.out.println("************* == *************");

		System.out.println(str1 == str2);// false
		System.out.println(str1 == str3);// false
		System.out.println(str1 == str4);// false
		System.out.println(str1 == str5);// false
		System.out.println(str2 == str3);// false
		System.out.println(str2 == str4);// false
		System.out.println(str2 == str5);// false
		System.out.println(str3 == str4);// true
		System.out.println(str3 == str5);// true
		System.out.println(str4 == str5);// true

		System.out.println("ID of str1: " + System.identityHashCode(str1));
		System.out.println("ID of str2: " + System.identityHashCode(str2));
		System.out.println("ID of str3: " + System.identityHashCode(str3));
		System.out.println("ID of str4: " + System.identityHashCode(str4));
		System.out.println("ID of str5: " + System.identityHashCode(str5));

		// equals() method
		System.out.println("************* equals() *************");

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5));
		System.out.println(str2.equals(str3));
		System.out.println(str2.equals(str4));
		System.out.println(str2.equals(str5));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
		System.out.println(str4.equals(str5));
		
		String s1 = "Java Programming";
		String s2 = " Programming";
		String s3 = "Java" + s2;
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s2.equals(s3));//false
		
		Integer num1 = 5;
		int num2 = 5;
		
		System.out.println(num1 == num2);//true
		System.out.println(num1.equals(num2));//true*/
		
		
		String[] cars1 = {"Ferrari", "Mercedes", "BMW"};
		String[] cars2 = new String[]{"Ferrari", "Mercedes", "BMW"};
		String[] cars3 = new String[3];
		
		cars3[0] = "Ferrari";
		cars3[1] = "Mercedes";
		cars3[2] = "BMW";
		
		String[] cars4 = cars2;
		
		System.out.println(cars1 == cars2);//false
		System.out.println(cars1 == cars3);//false
		System.out.println(cars1 == cars4);//false
		System.out.println(cars2 == cars3);//false
		System.out.println(cars2 == cars4);//true
		System.out.println(cars3 == cars4);//false
		
		System.out.println("************ equals()**************");//equals() <-> ==
		
		System.out.println(cars1.equals(cars2));//false
		System.out.println(cars1.equals(cars3));//false
		System.out.println(cars1.equals(cars4));//false
		System.out.println(cars2.equals(cars3));//false
		System.out.println(cars2.equals(cars4));//true
		System.out.println(cars3.equals(cars4));//false
		
		
		System.out.println("************ Arrays.equals() **************");
		
		System.out.println(Arrays.equals(cars1, cars2));//true
		System.out.println(Arrays.equals(cars1, cars3));//true
		System.out.println(Arrays.equals(cars1, cars4));//true
		System.out.println(Arrays.equals(cars2, cars3));//true
		System.out.println(Arrays.equals(cars2, cars4));//true
		System.out.println(Arrays.equals(cars3, cars4));//true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
