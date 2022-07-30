package serializationexample;

import java.io.Serializable;

public class Car implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5119441755317560520L;
	
	String model, color;
	int year, speed;
	transient boolean isAutomatic;
	
	transient SpeedOfCars carSpeed;
	
	public Car(String model, String color, int year, boolean isAutomatic, int speed) {
		super();
		this.model = model;
		this.color = color;
		this.year = year;
		this.isAutomatic = isAutomatic;
		
		carSpeed = new SpeedOfCars(speed);
		this.speed = carSpeed.maxSpeed;
	}
	
	@Override
	public String toString() {
		return "Model: " + this.model + "\nColor: " + this.color + "\nYear: " + this.year + "\nisAutomatic: " + this.isAutomatic 
				+ "\nMaxSpeed: " + this.speed;
	}
	
	
	

}
