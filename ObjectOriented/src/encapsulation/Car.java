package encapsulation;

public class Car extends Vehicle{
	
	private boolean isAutomatic;
	

	public Car(String model, int maxSpeed, boolean isAutomatic) {
		super(model, maxSpeed);
		// TODO Auto-generated constructor stub
		
		this.isAutomatic = isAutomatic;
		
	}


	//setter method of isAutomatic variable
	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}


	//getter method of isAutomatic variable
	public boolean isAutomatic() {
		return isAutomatic;
	}	
	
	
	
	

}
