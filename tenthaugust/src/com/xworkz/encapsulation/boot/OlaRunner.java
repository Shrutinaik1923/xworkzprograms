package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Ola;

public class OlaRunner {
	
		    public static void main(String[] args) {
		        Ola ola = new Ola();

		        ola.setDriverName("Sandeep");
		        ola.setCarModel("Swift");
		        ola.setLicensePlate("KA1C123");
		        ola.setCurrentLatitude(37.7749);
		        ola.setCurrentLongitude(-122.4194);
		        ola.setPassenger(4);
		        ola.setRidePrice(25.0);
		        ola.setAvailable(true);
		        ola.setRating( 4.5);
		        ola.setTotalRides(100);
		        ola.setPaymentMethod("Credit Card");
		        ola.setPromoCode("SUMMER50");
		        ola.setOnTrip(false);
		        ola.setDestination("Shopping Mall");

		        System.out.println( ola.getDriverName());
		        System.out.println( ola.getCarModel());
		        System.out.println(ola.getLicensePlate());
		        System.out.println( ola.getCurrentLatitude() );
		        System.out.println(ola.getCurrentLongitude());
		        System.out.println(ola.getPassengers());
		        System.out.println( ola.getRidePrice());
		        System.out.println( ola.isAvailable());
		        System.out.println( ola.getRatings());
		        System.out.println( ola.getTotalRides());
		        System.out.println( ola.getPaymentMethod());
		        System.out.println( ola.getPromoCode());
		        System.out.println(ola.isOnTrip());
		        System.out.println(ola.getDestination());
		    }
		}

