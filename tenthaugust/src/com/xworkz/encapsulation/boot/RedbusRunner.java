package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Redbus;

public class RedbusRunner {
	
		public static void main(String[] args) {
			System.out.println("Invoking main in RedbusRunner");
			Redbus redbus = new Redbus();

	        redbus.setDriverName("Ramesha");
	        redbus.setCarModel("Alto");
	        redbus.setLicensePlate("KA1C123");
	        redbus.setCurrentLatitude(37.7749);
	        redbus.setCurrentLongitude(-122.4194);
	        redbus.setPassenger(5);
	        redbus.setRidePrice(25.0);
	        redbus.setAvailable(true);
	        redbus.setRating( 4.5);
	        redbus.setTotalRides(100);
	        redbus.setPaymentMethod("Credit Card");
	        redbus.setPromoCode("SUMMER50");
	        redbus.setOnTrip(false);
	        redbus.setDestination("Shopping Mall");

	        System.out.println( redbus.getDriverName());
	        System.out.println( redbus.getCarModel());
	        System.out.println( redbus.getLicensePlate());
	        System.out.println( redbus.getCurrentLatitude()); 
	        System.out.println(redbus.getCurrentLongitude());
	        System.out.println(redbus.getPassengers());
	        System.out.println( redbus.getRidePrice());
	        System.out.println( redbus.isAvailable());
	        System.out.println( redbus.getRatings());
	        System.out.println(redbus.getTotalRides());
	        System.out.println( redbus.getPaymentMethod());
	        System.out.println( redbus.getPromoCode());
	        System.out.println( redbus.isOnTrip());
	        System.out.println(redbus.getDestination());

		}

	}



