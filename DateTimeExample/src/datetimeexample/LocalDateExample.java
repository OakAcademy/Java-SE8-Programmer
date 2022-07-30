package datetimeexample;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateExample {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		
		System.out.println("current date: " + currentDate);
		
		LocalDate after10DaysFromNow = currentDate.plusDays(10);
		
		System.out.println("after10DaysFromNow: " + after10DaysFromNow);
		
		LocalDate beforeOneWeekFromNow = currentDate.minusWeeks(1);
		
		System.out.println("beforeOneWeekFromNow: " + beforeOneWeekFromNow);
		
		//immutable
		System.out.println("current date: " + currentDate);
		
		currentDate = currentDate.plusDays(3);
		
		System.out.println("current date: " + currentDate);
		
		LocalDate myBirthday = LocalDate.of(1990, Month.FEBRUARY, 1);
		
		System.out.println("my birthday: " + myBirthday);
		
		
		System.out.println("is myBirthday before ? " + myBirthday.isBefore(currentDate));
		
		
		//before Java 8
		
		Date myCurrentDate = new Date();
		
		System.out.println("date before Java 8: " + myCurrentDate);
		
		Calendar myCalendar = Calendar.getInstance();
		
		myCalendar.set(1990, Calendar.FEBRUARY, 1);
		
		Date birthDay = myCalendar.getTime();
		
		System.out.println("my birthday before Java 8: " + birthDay);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
