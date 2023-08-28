package com.xworkz.builtin;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateRunner {

	public static void main(String[] args) {
	System.out.println("invoking main in LocalDateRunner");
	LocalDate today=LocalDate.now();
	LocalDate specificDate=LocalDate.of(2023,8, 26);
	LocalDate max=LocalDate.MAX;
	
	//Getting parts of the date
	int year=today.getYear();
	Month month=today.getMonth();
	int daysOfMonth=today.getDayOfMonth();
	int year1=today.getDayOfYear();
	int month1=today.getDayOfMonth();
	DayOfWeek dayOfWeek=today.getDayOfWeek();
	String dayOfWeekName=today.getDayOfWeek().name();
	
	System.out.println("year is:"+year);
	System.out.println("Month is:"+month);
	System.out.println("Month is:"+month);
	System.out.println("Day of Year is:"+year1);
	System.out.println("Day of Month is:"+month1);
	System.out.println("Day of Week is:"+dayOfWeek);
	System.out.println("Day of WeekName is:"+dayOfWeekName);
	
	//comparisons
	
	boolean isAfter=today.isAfter(specificDate);
	boolean isBefore=today.isBefore(specificDate);
	boolean isEqual=today.isEqual(specificDate);
	System.out.println("Is before?" +isBefore);
	System.out.println("Is after?"+isAfter);
	System.out.println("Is Equal?"+isEqual);
	
	//Adding and substring days
	
	LocalDate futureDate=today.plusDays(8);
	LocalDate pastDate=today.minusDays(7);
	System.out.println("Future date:"+futureDate);
	System.out.println("Past Date:"+pastDate);
	
	


	}

}
