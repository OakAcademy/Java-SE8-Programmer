package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;

public class SearchingArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> age = new ArrayList<>();
		
		age.add(16);
		age.add(8);
		age.add(14);
		age.add(12);
		age.add(36);
		age.add(24);
		age.add(19);
		
		Collections.sort(age);// 5 8 12 14 16 19 24 36
		
		System.out.println(Collections.binarySearch(age, 14));//2
		System.out.println(Collections.binarySearch(age, 24));//5
		System.out.println(Collections.binarySearch(age, 5));// -1

	}

}
