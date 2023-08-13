package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Uber;

public class UberRunner {
		public static void main(String[] args) {
			Uber uber = new Uber();

		        uber.setDriverName("Sandeep");
		        uber.setCarModel("Swift");
		        uber.setLicensePlate("KA1C123");
		        uber.setCurrentLatitude(37.7749);
		        uber.setCurrentLongitude(-122.4194);
		        uber.setPassenger(4);
		        uber.setRidePrice(25.0);
		        uber.setAvailable(true);
		        uber.setRating( 4.5);
		        uber.setTotalRides(100);
		        uber.setPaymentMethod("Credit Card");
		        uber.setPromoCode("SUMMER50");
		        uber.setOnTrip(false);
		        uber.setDestination("Shopping Mall");

		        System.out.println( uber.getDriverName());
		        System.out.println( uber.getCarModel());
		        System.out.println(uber.getLicensePlate());
		        System.out.println( uber.getCurrentLatitude() );
		        System.out.println(uber.getCurrentLongitude());
		        System.out.println(uber.getPassengers());
		        System.out.println( uber.getRidePrice());
		        System.out.println( uber.isAvailable());
		        System.out.println( uber.getRatings());
		        System.out.println( uber.getTotalRides());
		        System.out.println( uber.getPaymentMethod());
		        System.out.println( uber.getPromoCode());
		        System.out.println(uber.isOnTrip());
		        System.out.println(uber.getDestination());
		}

	}



