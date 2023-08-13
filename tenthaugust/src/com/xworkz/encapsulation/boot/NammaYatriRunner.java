package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.NammaYatri;

public class NammaYatriRunner {



		public static void main(String[] args) {
			 System.out.println("Running main in NammaYatriRunner:");
	        NammaYatri nammaYatri = new NammaYatri();

	        nammaYatri.setPassengerName("Seemitha");
	        System.out.println(nammaYatri.getPassengerName());

	        nammaYatri.setSourceLocation("Station A");
	        System.out.println( nammaYatri.getSourceLocation());

	        nammaYatri.setDestinationLocation("Station B");
	        System.out.println( nammaYatri.getDestinationLocation());

	        nammaYatri.setTravelDate("20-07-2023");
	        System.out.println( nammaYatri.getTravelDate());

	        nammaYatri.setTravelTime("08:30 AM");
	        System.out.println( nammaYatri.getTravelTime());

	        nammaYatri.setTicketType("Single Journey");
	        System.out.println( nammaYatri.getTicketType());

	        nammaYatri.setCoachType("First Class");
	        System.out.println( nammaYatri.getCoachType());

	        nammaYatri.setTicketPrice(30.0);
	        System.out.println( nammaYatri.getTicketPrice());

	        nammaYatri.setReturnTicket(false);
	        System.out.println( nammaYatri.isReturnTicket());

	        nammaYatri.setSeniorCitizen(true);
	        System.out.println( nammaYatri.isSeniorCitizen());

	        nammaYatri.setStudent(false);
	        System.out.println(nammaYatri.isStudent());

	        nammaYatri.setHasLuggage(true);
	        System.out.println( nammaYatri.hasLuggage());

	        nammaYatri.setNumberOfPassengers(1);
	        System.out.println( nammaYatri.getNumberOfPassengers());

	    }

	}



