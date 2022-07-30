package comparatorapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

	public static void main(String[] args) {
		
		List<Employees> employeeList = new ArrayList<>();
		
		employeeList.add(new Employees("David", 30, 1000));
		employeeList.add(new Employees("Alex", 25, 5000));
		employeeList.add(new Employees("Ronaldo", 20, 2000));
		employeeList.add(new Employees("Marry", 35, 7000));
		employeeList.add(new Employees("Clark", 27, 10000));
		employeeList.add(new Employees("James", 23, 3000));
		
		Comparator<Employees> comparator = Comparator.comparing(Employees::getSalary);
		
		Collections.sort(employeeList,comparator);
		
		for(Employees employee : employeeList) {
			
			System.out.println("Name: " + employee.getName() + " \tAge: " + employee.getAge() + " \tSalary: " + employee.getSalary());
			
		}

	}

}
