package collectionsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethods2 {

	public static void main(String[] args) {
		
		ArrayList<String> languages = new ArrayList<>();
		System.out.println(languages.size());
		
		System.out.println(languages.isEmpty());
		
		languages.add("Java");
		languages.add("C#");
		languages.add("Scala");
		languages.add("Kotlin");
		
		System.out.println(languages.size());
		System.out.println(languages.isEmpty());
		
		//contains()
		System.out.println(languages.contains("C++"));//return false
		System.out.println(languages.contains("Kotlin"));//return true
		
		//clear()
		languages.clear();
		if(languages.isEmpty()) {
			System.out.println("The clear() method deleted all elements");
		}else {
			System.out.println("There is a problem");
		}
		
		//equals()
		ArrayList<Object> test1 = new ArrayList<>();
		test1.add("Java");
		test1.add("Kotlin");
		test1.add("Scala");
		
		ArrayList<String> test2 = new ArrayList<>();
		
		test2.add("Scala");
		test2.add("Kotlin");
		test2.add("Java");
		
		
		System.out.println(test1.equals(test2));//false

	}

}
