package collectionsexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Integer> numsList = new ArrayList<>();
		
		numsList.add(10);
		numsList.add(5);
		numsList.add(13);
		numsList.add(7);
		numsList.add(20);
		numsList.add(2);
		
		Collections.sort(numsList, new MyNumbers());
		
		System.out.println(numsList);

	}

}

class MyNumbers implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		if(o1 < o2) {
			return 1;
		}else if (o1 > o2) {
			return -1;
		}else {
			return 0;
		}
		
		
	}
	
	
	
}

















