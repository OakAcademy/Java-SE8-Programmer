package methodoverriding;

public class Car extends Vehicle{

	public void start() {
		
		System.out.println("The Car has started");
		
	}
	
	public void accelerate(int speed) {
		
		System.out.println("The Car accelerates at " + speed);
		
	}
	
	public void stop() {
		
		System.out.println("Car has stopped");
		
	}
	
}
