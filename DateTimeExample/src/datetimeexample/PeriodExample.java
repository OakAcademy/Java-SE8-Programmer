package datetimeexample;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("current date: " + currentDate);
		
		Period period = Period.of(3, 7, 2);
		
		System.out.println("period: " + period);
		
		System.out.println("after adding period: " + currentDate.plus(period));
		
		LocalDate weddingDate = LocalDate.of(2023, 7, 20);
		
		System.out.println("remaining time to wedding: " + Period.between(currentDate, weddingDate));
		
		Period newPeriod = Period.ofWeeks(2);
		
		for(int i = 0; i < 10; i++) {
			
			currentDate = currentDate.plus(newPeriod);
			System.out.println("after 2 weeks: " + currentDate);
			
		}

	}

}
