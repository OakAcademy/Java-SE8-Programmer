package superthis;

public class SuperThisTest {

	public static void main(String[] args) {

		Car myCar = new Car("Car", "Ferrari", 320, true);
		
		System.out.println("type: " + myCar.getType());
		System.out.println("model: " + myCar.getModel());
		System.out.println("maxSpeed: " + myCar.getMaxSpeed());
		System.out.println("isAutomatic: " + myCar.isAutomatic());
		
	}

}
