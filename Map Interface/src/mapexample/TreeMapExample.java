package mapexample;

import java.io.Serializable;
import java.rmi.Remote;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> studentsMap = new TreeMap<>();
		
		studentsMap.put(120, "David");
		studentsMap.put(101, "Alex");
		studentsMap.put(105, "Marry");
		studentsMap.put(103, "Ronaldo");
		studentsMap.put(110, "James");
		
		System.out.println("studentsMap: " + studentsMap);
		
		//System.out.println("descendingKeySet: " + studentsMap.descendingKeySet());
		
		//System.out.println("descendingMap: " + studentsMap.descendingMap());
		
		studentsMap.remove(103);
		studentsMap.replace(110, "Clark");
		
		//for-each
		for(int sKey : studentsMap.keySet()) {
			
			System.out.println("Name: " + studentsMap.get(sKey) + " \tRoll Number: " + sKey);
			
		}

	}

}
