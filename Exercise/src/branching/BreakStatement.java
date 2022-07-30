package branching;

public class BreakStatement {

	public static void main(String[] args) {
		
		/*
		int number = 100;
		if(number == 100) {
			break;//compilation error
		}*/
		
		
		
		
		String[] cars = {"Mercedes", "BMW", "Ferrari", "Opel", "Ford"};
		
		int indexNumber = 0;
		String car = null;
		//Label
		carLoop:while(indexNumber < cars.length) {
			
			car = cars[indexNumber];
			if(car == "Opel")
				break carLoop;
			indexNumber++;
			
			
		}
		
		System.out.println(car);
		
		
		
		
		
		
		
		/*for(String car : cars) {
			
			if(car == "Opel") {
				break;
			}
			
			System.out.println(car);
			
		}*/
		
		
		
		
		
		
		/*for(int i = 0; i < 10; i++) {
			
			if(i == 7)
				break;
			System.out.println(i);
			
		}*/
		
		
		
		
		
		
		
		/*
		int a = 0;
		
		switch(a) {
		
			case 0:
				System.out.println("Hi!");
				//break;
			case 1:
				System.out.println("Hello!");
				break;
		
		}*/

	}

}
