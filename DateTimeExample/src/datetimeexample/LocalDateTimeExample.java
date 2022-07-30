package datetimeexample;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		System.out.println("current date time: " + currentDateTime);
		
		LocalDateTime afterADayFromNow = currentDateTime.plusDays(1);
		
		System.out.println("afterADayFromNow: " + afterADayFromNow);
		
		LocalDateTime beforeAMonthFromNow = currentDateTime.minusMonths(1);
		
		System.out.println("beforeAMonthFromNow: " + beforeAMonthFromNow);
		
		System.out.println("current date time: " + currentDateTime);
		
		currentDateTime = currentDateTime.minusYears(2);
		
		System.out.println("current date time: " + currentDateTime);
		
		LocalDateTime myWeddingDateTime = LocalDateTime.of(2014, Month.AUGUST, 14, 15, 30, 1);
		
		System.out.println("myWeddingDateTime: " + myWeddingDateTime);
		
		System.out.println("is myWeddingDateTime before ? " + myWeddingDateTime.isBefore(currentDateTime));

	}

}
