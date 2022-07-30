package datetimeexample;

import java.time.LocalTime;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		LocalTime currentTime = LocalTime.now();
		
		System.out.println("current time: " + currentTime);
		
		LocalTime afterAnHourFromNow = currentTime.plusHours(1);
		
		System.out.println("afterAnHourFromNow: " + afterAnHourFromNow);
		
		LocalTime before10MinutesFromNow = currentTime.minusMinutes(10);
		
		System.out.println("before10MinutesFromNow: " + before10MinutesFromNow);
		
		//immutable
		
		System.out.println("current time: " + currentTime);
		
		currentTime = currentTime.plusHours(2);
		
		System.out.println("current time: " + currentTime);
		
		LocalTime myMeetingTime = LocalTime.of(17, 30, 30);
		
		System.out.println("my meeting time: " + myMeetingTime);
		
		System.out.println("is myMeetingTime before ? " + myMeetingTime.isBefore(currentTime));
		

	}

}
