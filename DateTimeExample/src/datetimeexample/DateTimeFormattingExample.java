package datetimeexample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormattingExample {

	public static void main(String[] args) {
		
		LocalDate myDate = LocalDate.of(2022, 2, 20);
		LocalTime myTime = LocalTime.of(10, 30, 25);
		LocalDateTime myDateTime = LocalDateTime.of(myDate, myTime);
		
		System.out.println("default date-time: " + myDateTime);
		
		DateTimeFormatter myConstantFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		
		System.out.println("ISO date-time: " + myDateTime.format(myConstantFormatter));
		
		DateTimeFormatter myLocalizedFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println("localized style medium: " + myDateTime.format(myLocalizedFormatter));
		
		DateTimeFormatter myCustomFormatter = DateTimeFormatter.ofPattern("yyyy.MMMM.dd hh:mm");
		System.out.println("custom date-time: " + myCustomFormatter.format(myDateTime));

	}

}
