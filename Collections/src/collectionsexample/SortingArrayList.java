package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {

	public static void main(String[] args) {
		
		//Integer ArayList
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(6);
		numbers.add(4);
		numbers.add(11);
		numbers.add(32);
		numbers.add(2);
		numbers.add(50);
		
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		//Character ArrayList
		
		ArrayList<Character> myChars = new ArrayList<>();
		
		myChars.add('a');
		myChars.add('B');
		myChars.add('A');
		myChars.add('F');
		myChars.add('b');
		myChars.add('E');
		
		Collections.sort(myChars);
		
		System.out.println(myChars);
		
		
		//String ArrayList
		ArrayList<String> myCars = new ArrayList<>();
		
		myCars.add("Ferrari");
		myCars.add("Opel");
		myCars.add("Mercedes");
		myCars.add("BMW");
		myCars.add("Ford");
		myCars.add("hyundai");
		
		Collections.sort(myCars);
		
		System.out.println(myCars);
		
		
		
		ArrayList<String> myNums = new ArrayList<>();
		
		myNums.add("50"); //5
		myNums.add("70"); //7
		myNums.add("5"); // 5
		myNums.add("90"); //9
		myNums.add("9");  //9
		myNums.add("60"); //6
		myNums.add("a");  
		myNums.add("Z");
		
		Collections.sort(myNums);//5 50 60 70 9 90 Z a
		
		System.out.println(myNums);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
