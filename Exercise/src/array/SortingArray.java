package array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		//int
		int[] numbers = {5, 3, 10, 30, 1, 50};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		//double
		double[] myDoubles = {1.2, 3.5, -2.5, 0.7, 10.0, 11};
		Arrays.sort(myDoubles);
		System.out.println(Arrays.toString(myDoubles));
		
		//char
		char[] myChars = {'a', 'B', 'A', 'F', 'b', 'E'};
		Arrays.sort(myChars);
		System.out.println(Arrays.toString(myChars));
		
		//String
		String[] myCars = {"Ferrari", "Opel", "Mercedes", "BMW", "Ford", "hyundai"};
		Arrays.sort(myCars);
		System.out.println(Arrays.toString(myCars));
		
		String[] myNums = {"50", "70", "5", "90", "9", "60", "a", "Z"};//5 7 5 9 9 6 --> 5 50 60 70 9 90 Z a
		Arrays.sort(myNums);
		System.out.println(Arrays.toString(myNums));

	}

}
