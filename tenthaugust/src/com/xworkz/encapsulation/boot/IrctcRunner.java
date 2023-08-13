package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Irctc;

public class IrctcRunner {
	 	public static void main(String[] args) {
				System.out.println("Running main in IRCTC:");
		        Irctc user = new Irctc();

		        user.setUsername("Swasthik");
		        System.out.println( user.getUsername());

		        user.setEmail("swasthik@gmail.com");
		        System.out.println( user.getEmail());

		        user.setFullName("Swasthik JK");
		        System.out.println( user.getFullName());

		        user.setPhoneNumber("8088170018");
		        System.out.println( user.getPhoneNumber());

		        user.setAddress("Surya");
		        System.out.println( user.getAddress());

		        user.setPreferredLanguage("English");
		        System.out.println( user.getPreferredLanguage());

		        user.setSeniorCitizen(false);
		        System.out.println(user.isSeniorCitizen());

		        user.setStudent(true);
		        System.out.println( user.isStudent());

		        user.setHasChildren(false);
		        System.out.println( user.isHasChildren());

		        user.setTotalBookings(10);
		        System.out.println( user.getTotalBookings());

		        user.setLoyaltyPoints(250);
		        System.out.println( user.getLoyaltyPoints());

		        user.setWalletBalance(1500.50);
		        System.out.println( user.getWalletBalance());

		        user.setGender('M');
		        System.out.println( user.getGender());

		        user.setAge(22);
		        System.out.println( user.getAge());


		    }
		}



