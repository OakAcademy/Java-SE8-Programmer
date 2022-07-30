package collectionsexample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> myCarSet = new HashSet<String>();
		
		myCarSet.addAll(Arrays.asList(new String[] {"Ferrari","Ford","BMW","Ford", "Opel","Hyundai"}));
		
		System.out.println("myCarSet: " + myCarSet);
		
		System.out.println("size of myCarSet: " + myCarSet.size());
		
		myCarSet.remove("BMW");
		
		System.out.println("after removing BMW: " + myCarSet);
		
		System.out.println("Does myCarSet contains Mercedes ? " + myCarSet.contains("Mercedes"));
		
		System.out.println("***********************************");
		
		Set<Integer> mySet1 = new HashSet<>();
		
		mySet1.addAll(Arrays.asList(1,3,4,8,9,7,5));
		
		System.out.println("mySet1: " + mySet1);
		
		Set<Integer> mySet2 = new HashSet<>();
		
		mySet2.addAll(Arrays.asList(1,2,3,6,4,10,4));
		
		System.out.println("mySet2: " + mySet2);
		
		//Union elements
		
		Set<Integer> unionSet = new HashSet<>(mySet1);
		unionSet.addAll(mySet2);
		
		System.out.println("union set: " + unionSet);
		
		//Intersection elements
		
		Set<Integer> intersectionSet = new HashSet<>(mySet1);
		intersectionSet.retainAll(mySet2);
		
		System.out.println("intersection set: " + intersectionSet);
		
		
		//different elements
		
		Set<Integer> differenceSet = new HashSet<>(mySet1);
		differenceSet.removeAll(mySet2);
		
		System.out.println("difference elements: " + differenceSet);
		
		System.out.println("********** HashSet ***************");
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Dog");
		hs1.add("Cat");
		hs1.add("Monkey");
		hs1.add("Monkey");
		hs1.add("Cow");
		hs1.add("Lion");
		hs1.add("Lion");
		hs1.add("Snake");
		
		System.out.println("hs1: " + hs1);
		
		
		System.out.println("********** LinkedHashSet ***************");
		
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("Dog");
		lhs1.add("Cat");
		lhs1.add("Monkey");
		lhs1.add("Monkey");
		lhs1.add("Cow");
		lhs1.add("Lion");
		lhs1.add("Lion");
		lhs1.add("Snake");
		
		System.out.println("lhs1: " + lhs1);
		
		System.out.println("********** TreeSet ***************");
		
		TreeSet<String> myCitiesSet = new TreeSet<>();
		
		myCitiesSet.add("Paris");
		myCitiesSet.add("London");
		myCitiesSet.add("Rome");
		myCitiesSet.add("Washington");
		myCitiesSet.add("Washington");
		myCitiesSet.add("NewYork");
		myCitiesSet.add("Berlin");
		myCitiesSet.add("Tokyo");
		myCitiesSet.add("Tokyo");
		myCitiesSet.add("Amsterdam");
		
		System.out.println("Descending: " + myCitiesSet.descendingSet());
		
		System.out.println("myCitiesSet: " + myCitiesSet);
		
		System.out.println("HeadSet: " + myCitiesSet.headSet("NewYork"));
		
		System.out.println("SubSet: " + myCitiesSet.subSet("London", "Washington"));
		
		System.out.println("TailSet: " + myCitiesSet.tailSet("NewYork"));
		
		System.out.println("First Element: " + myCitiesSet.first());
		
		System.out.println("Last element: " + myCitiesSet.last());
		
		System.out.println("Retrieve and remove the first element: " + myCitiesSet.pollFirst());
		
		System.out.println("Retrieve and remove the last element: " + myCitiesSet.pollLast());
		
		System.out.println("myCititesSet: " + myCitiesSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
