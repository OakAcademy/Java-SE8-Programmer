package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] numbers = new int[4];
		
		numbers[0] = 4;
		numbers[1] = (int) 6.5;
		numbers[2] = -3;
		numbers[3] = -2;

		System.out.println(Arrays.toString(numbers));
		
		
		int[] age = new int[]{15, 20, 25};
		System.out.println(Arrays.toString(age));
		
		int[] age2 = {15, 20, 25};
		System.out.println(Arrays.toString(age2));
		
		int[] age3 = new int[] {};
		//age3[0] = 5;
		System.out.println(Arrays.toString(age3));
		
		
		double a = 7;
		double b = 2;
		
		String cars[] = new String[(int)a/(int)b];
		
		System.out.println("The length of cars array is " + cars.length);
		
		int x, y, z;
		
		String cars3[], books, plants;//cars3 is array but books and plants is String	
		
		
		
	}

}
