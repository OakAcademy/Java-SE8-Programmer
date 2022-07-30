package trafficlight;

public enum TrafficLight {
	
	RED("stop"),
	YELLOW("wait"),
	GREEN("go");
	
	private String action;
	
	private TrafficLight(String action) {
		
		this.action = action;
		
	}
	
	//getter method of action
	public String getAction() {
		
		return action;
		
	}

}
