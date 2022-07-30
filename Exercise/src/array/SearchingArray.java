package array;

import java.util.Arrays;

public class SearchingArray {

	public static void main(String[] args) {
		
		int[] age = {8, 12, 14, 16, 19, 24,36}; 
		
		System.out.println(Arrays.binarySearch(age, 14));//2
		System.out.println(Arrays.binarySearch(age, 24));//5
		System.out.println(Arrays.binarySearch(age, 5));//-1
		System.out.println(Arrays.binarySearch(age, 30));//-7
		
		String[] cars = {"BMW", "Ferrari", "Ford", "Mercedes", "Opel",};
		
		System.out.println(Arrays.binarySearch(cars, "BMW"));//0
		System.out.println(Arrays.binarySearch(cars, "Volkswagen"));//-6

	}

}
