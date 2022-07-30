package mapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> agesMap = new HashMap<>();
		
		agesMap.put("David", 20);
		agesMap.put("Ronaldo", 25);
		agesMap.put("Alex", 30);
		agesMap.put("David", 35);
		agesMap.put("Marry", 40);
		
		agesMap.remove("Marry");
		agesMap.replace("Alex", 50);
		
		System.out.println("agesMap: " + agesMap);
		
		System.out.println("age of David: " + agesMap.get("David"));
		
		/*for(String name : agesMap.keySet()) {
			
			System.out.println("Age of " + name + " is " + agesMap.get(name));
			
		}*/
		
		for(Map.Entry<String, Integer> mapEntry : agesMap.entrySet()) {
			
			System.out.println("Age of " + mapEntry.getKey() + " is " + mapEntry.getValue());
			
		}
		
		LinkedHashMap<String, String> countryCodes = new LinkedHashMap<>();
		
		countryCodes.put("DE", "Germany");
		countryCodes.put("FR", "France");
		countryCodes.put("GB", "United Kingdom");
		countryCodes.put("IT", "Italy");
		
		System.out.println("countryCodes: " + countryCodes);

	}

}
