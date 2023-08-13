package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.NammaMetro;

public class NammaMetroRunner {
	
			public static void main(String[] args) {
				 System.out.println("Running main in NammaMetroRunner:");
		        NammaMetro nammaMetro = new NammaMetro();

		        nammaMetro.setPassengerName("Thanu");
		        System.out.println( nammaMetro.getPassengerName());

		        nammaMetro.setStationFrom("Rajajinagar");
		        System.out.println(nammaMetro.getStationFrom());

		        nammaMetro.setStationTo("Yalahanka");
		        System.out.println( nammaMetro.getStationTo());

		        nammaMetro.setTravelDate("20-06-2023");
		        System.out.println(nammaMetro.getTravelDate());

		        nammaMetro.setTravelTime("09:00 AM");
		        System.out.println( nammaMetro.getTravelTime());

		        nammaMetro.setTicketType("Single Journey");
		        System.out.println( nammaMetro.getTicketType());

		        nammaMetro.setMetroLine("Blue Line");
		        System.out.println( nammaMetro.getMetroLine());

		        nammaMetro.setTicketPrice(25.0);
		        System.out.println(nammaMetro.getTicketPrice());

		        nammaMetro.setReturnTicket(false);
		        System.out.println(nammaMetro.isReturnTicket());

		        nammaMetro.setSeniorCitizen(true);
		        System.out.println(nammaMetro.isSeniorCitizen());

		        nammaMetro.setStudent(false);
		        System.out.println( nammaMetro.isStudent());

		        nammaMetro.setRushHour(true);
		        System.out.println( nammaMetro.isRushHour());

		        nammaMetro.setNumberOfPassengers(1);
		        System.out.println( nammaMetro.getNumberOfPassengers());


		    }




	}

	


