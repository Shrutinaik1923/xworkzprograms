package com.xworkz.stringInbuiltClass;

import java.sql.Date;

public class DateRunner {

	public static void main(String[] args) {


				Date currentDate = new Date();

		        // getTime()
		        long timestamp = currentDate.getTime();
		        System.out.println("Timestamp: " + timestamp);

		        // after(Date when) and before(Date when)
		        Date futureDate = new Date(timestamp + 86400000); // Adding one day's worth of milliseconds
		        boolean isAfter = futureDate.after(currentDate);
		        boolean isBefore = futureDate.before(currentDate);
		        System.out.println("Is futureDate after currentDate? " + isAfter);
		        System.out.println("Is futureDate before currentDate? " + isBefore);

		        // equals(Object obj)
		        boolean isEqual = currentDate.equals(futureDate);
		        System.out.println("Is currentDate equal to futureDate? " + isEqual);

		        // toString()
		        String dateString = currentDate.toString();
		        System.out.println("Date as string: " + dateString);

		        // compareTo(Date anotherDate)
		        int comparison = currentDate.compareTo(futureDate);
		        System.out.println("Comparison result: " + comparison);
			}

		
	}


