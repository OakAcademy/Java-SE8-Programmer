package lambdaexpressionexample;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		/*
		
		Predicate<Integer> predicate1 = t -> (t < 20);
		
		//boolean result = predicate1.test(15);
		
		//System.out.println(result);
		
		Predicate<Integer> predicate2 = t -> (t > 10);
		
		//boolean result = predicate1.and(predicate2).test(15);
		
		boolean result = predicate1.or(predicate2).test(15);
		
		System.out.println(result);
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Please verify your name: ");
		
		String userName = inputScanner.next();
		
		showResult(userName, personName -> (personName.equals("David")));
		
		inputScanner.close();*/
		
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("NewYork");
		cities.add("Berlin");
		cities.add("Tokyo");
		
		System.out.println("cities: " + cities);
		
		cities.removeIf(city -> (city.equals("NewYork")));
		
		System.out.println("after predicate: " + cities);
		

	}
	
	public static void showResult(String name, Predicate<String> mPredicate) {
		
		if(mPredicate.test(name)) {
			
			System.out.println("Welcome " + name);
			
		}else {
			System.out.println("Unknown person");
		}
		
	}

}
