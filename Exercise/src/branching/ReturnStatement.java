package branching;

public class ReturnStatement {

	public static void main(String[] args) {
		
		
		String[] animals = {"Bird", "Cat", "Dog", "Bear", "Bee"};
		
		for(String animal : animals) {
			
			if(animal == "Bear") {
				
				return;//we can not use the labels with return keyword
				
			}
			
			System.out.println(animal);
			
		}
		
		System.out.println("This statement will not be executed");
		
		
		
		
		
		/*
		boolean bool = true;
		
		System.out.println("Before the return keyword");
		
		if(bool) {//bool == true
			return;
		}
		
		System.out.println("This statement will not be executed");*/
		
		
		
		
		/*int k = 2;
		
		switch(k) {
		
			case 1:
				System.out.println("1");
				break;//exit from switch
			case 2:
				System.out.println("2");
				return;//exit current method
		
		}
		
		System.out.println("Welcome!");*/

	}

}
