package DateTimeDemo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Demo1 {
	public static void main(String[] args) {
		
		LocalDate obj1=LocalDate.now();
		
		System.out.println(obj1.toString());
		
		LocalDate obj2=LocalDate.of(2024, 06, 25);
		
		System.out.println(obj2.toString());
		
		Period p1=Period.between(obj2, obj1);
		
		System.out.println(p1.getYears());
		System.out.println(p1.getMonths());
		System.out.println(p1.getDays());
		
		LocalTime t1=LocalTime.now();
		System.out.println(t1.toString());
		
		LocalTime t2=LocalTime.of(23, 30, 55);
		
		System.out.println(t2.toString());
		
		Duration d1=Duration.between(t1, t2);
		
		System.out.println(d1.toHours());
		System.out.println(d1.toMinutes());
		System.out.println(d1.toSeconds());
		
	}
}
