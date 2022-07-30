package branching;

public class ContinueStatement {

	public static void main(String[] args) {
		
		/*
		int number = 50;
		if(number == 50)
			continue;//we can not use the continue keyword outside the loop
			*/
		
		
		
		String[] cars = {"Mercedes", "BMW", "Ferrari", "Opel", "Ford"};
		
		int indexNumber = 0;
		String car = null;
		
		CAR_LOOP:while(indexNumber < cars.length) {
			
			
			
			//on last iteration indezNumber will be 5
			
			car = cars[indexNumber];//Index out of bounds Exception
			
			indexNumber++;
			
			if(car == "Ford") {
				continue CAR_LOOP;
			}
			
			System.out.println(car);
			
			
		}
		
		
		
		
		/*for(String car : cars) {
			
			if(car == "Opel")
				continue;
			System.out.println(car);
			
		}*/
		
		
		
		
		
		/*for(int i = 0; i < 10; i++) {
			
			if(i % 2 == 0) {
				
				continue;
				
			}
			
			System.out.println(i);
			
		}*/

	}

}
