package collectionsexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConversionsListsArray {

	public static void main(String[] args) {
		
		//List --> Array
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Ferrari");
		list1.add("Mercedes");
		list1.add("BMW");
		list1.add("Ford");
		
		//Object[] array1 = list1.toArray();
		
		//String[] array1 = new String[list1.size()];
		//String[]array1 = list1.toArray(new String[list1.size()]);
		
		
		String[] array1 = new String[list1.size()];
		
		for(int i=0; i < list1.size(); i++) {
			
			array1[i] = list1.get(i);
			
		}
		
		list1.add("Opel");
		
		System.out.println(list1);
		System.out.println(Arrays.toString(array1));
		
		
		//Array --> List
		String[] animalsArray = {"Dog", "Cat", "Cow", "Lion"};
		
		List<String> animalsList = Arrays.asList(animalsArray);
		//ArrayList<String> animalsList = new ArrayList<>(Arrays.asList(animalsArray));
		
		//ArrayList<String> animalsList = new ArrayList<>();
		
		//Collections.addAll(animalsList, animalsArray);
		
		/*
		for(String animal : animalsArray) {
			
			animalsList.add(animal);
			
		}*/
		
		//animalsList.add("Monkey");
		
		//animalsArray[0] = "Rabbit";
		
		animalsList.set(0, "Rabbit");
		
		System.out.println(Arrays.toString(animalsArray));
		System.out.println(animalsList);
		
	}

}
