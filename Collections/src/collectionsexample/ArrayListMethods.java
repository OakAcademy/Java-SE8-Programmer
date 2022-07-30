package collectionsexample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<Object> myList1 = new ArrayList<>();
		myList1.add(5);
		myList1.add("Java");
		myList1.add(2.8);
		
		System.out.println(myList1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("Ferrari");
		list2.add("Mercedes");
		list2.add(2,"BMW");
		list2.add(1,"Ford");//Ferrari, Ford, Mercedes, BMW
		
		System.out.println(list2);
		
		list2.remove(2);
		list2.remove("Ferrari");
		
		list2.set(1, "Opel");
		
		System.out.println(list2.toString());
		
		//ArrayList<String> newList = {"Ferrari"};

	}

}
