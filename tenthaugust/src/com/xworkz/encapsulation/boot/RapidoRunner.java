package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Rapido;

public class RapidoRunner {
	
		public static void main(String[] args) {
			Rapido rapido = new Rapido();

		        rapido.setDriverName("Sandeep");
		        rapido.setCarModel("Electric Bike");
		        rapido.setLicensePlate("KA1C123");
		        rapido.setCurrentLatitude(47.7749);
		        rapido.setCurrentLongitude(-322.4194);
		        rapido.setPassenger(1);
		        rapido.setRidePrice(25.0);
		        rapido.setAvailable(true);
		        rapido.setRating( 4.5);
		        rapido.setTotalRides(200);
		        rapido.setPaymentMethod("Credit Card");
		        rapido.setPromoCode("SUMMER50");
		        rapido.setOnTrip(false);
		        rapido.setDestination("Market");

		        System.out.println( rapido.getDriverName());
		        System.out.println( rapido.getCarModel());
		        System.out.println(rapido.getLicensePlate());
		        System.out.println( rapido.getCurrentLatitude() );
		        System.out.println(rapido.getCurrentLongitude());
		        System.out.println(rapido.getPassengers());
		        System.out.println( rapido.getRidePrice());
		        System.out.println( rapido.isAvailable());
		        System.out.println( rapido.getRatings());
		        System.out.println( rapido.getTotalRides());
		        System.out.println( rapido.getPaymentMethod());
		        System.out.println( rapido.getPromoCode());
		        System.out.println(rapido.isOnTrip());
		        System.out.println(rapido.getDestination());
		}

	}



