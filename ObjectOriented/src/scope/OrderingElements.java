

package scope;//1

import java.util.Date;//2

public class OrderingElements {//3
	
	int age = 20;
	
	
	public static void main(String[] args) {//4
		
		/*
		int multiply() {
			return 5;
		}*/
		
		sum();
		
	}
	
	public static void sum() {
		
		char myChar = 'A';
		
	}
	
	int multiply() {
		
		sum();
		
		return 5;
	}
	
	

}

/*
public void sum() {
	
}*/

class Scope{
	
}

/*
public class Calculator{
	
}*/

/*
private class Calculator{}*/



