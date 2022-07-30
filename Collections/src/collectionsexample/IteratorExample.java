package collectionsexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorExample {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		
		for(int i = 0; i <= 100; i++) {
			
			nums.add(i);
			
		}
		
		System.out.println(nums);
		
		//ListIterator
		
		ListIterator<Integer> numsListIterator = nums.listIterator();
		
		while(numsListIterator.hasNext()) {
			
			int indexNum = numsListIterator.nextIndex();
			System.out.print(indexNum + " ");
			
			int num = numsListIterator.next();
			
			if(num % 4 != 0) {
				
				numsListIterator.set(1);
				
			}
			
		}
		
		
		
		//Iterator
		
		/*
		Iterator<Integer> numsIterator = nums.iterator();
		
		while(numsIterator.hasNext()) {
			
			int num = numsIterator.next();
			
			if(num % 4 != 0) {
				
				numsIterator.remove();
				
			}
			
		}*/
		
		System.out.println();
		
		System.out.println(nums);

	}

}
