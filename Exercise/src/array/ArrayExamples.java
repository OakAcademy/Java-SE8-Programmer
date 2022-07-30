package array;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {
		
		int[] numbers = new int[4];
		
		numbers[0] = 4;
		numbers[1] = 6;
		numbers[2] = -3;
		numbers[3] = -2;
		//numbers[4] = 7;
		
		
		System.out.println("Sum = " + (numbers[0] + numbers[1] + numbers[2] + numbers[3]));
		
		int[] number = {4, 6, -3, -2};
		
		System.out.println("Before altering : " + Arrays.toString(number));
		
		number[1] = 12;
		
		System.out.println("After altering : " + Arrays.toString(number));
		
		System.out.println("Sum of new array = " + (number[0] + number[1] + number[2] + number[3]));
		
		String[] cars = {"Mercedes", "BMW", "Ferraari"};
		
		System.out.println("cars[0] : " + cars[0]);
		System.out.println("cars[1] : " + cars[1]);
		System.out.println("cars[2] : " + cars[2]);
		//System.out.println("cars[3] : " + cars[3]);
		
		int[] ages = new int[4];
		//ages.length = 10;--> invalid

	}

}
