package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Cred;

public class CredRunner {
	

			public static void main(String[] args) {
				System.out.println("Running main in Cred:");
				Cred cred = new Cred();


				cred.setUsername("asha");
				System.out.println( cred.getUsername());


				cred.setEmail("asha@example.com");
				System.out.println(cred.getEmail());


				cred.setFullName("Asha");
				System.out.println( cred.getFullName());


				cred.setPhoneNumber("123-456-7890");
				System.out.println(cred.getPhoneNumber());


				cred.setAddress("123 Main St, CityMarket");
				System.out.println( cred.getAddress());


				cred.setOccupation("Software Engineer");
				System.out.println( cred.getOccupation());


				cred.setVerified(true);
				System.out.println( cred.isVerified());


				cred.setPremium(false);
				System.out.println( cred.isPremium());


				cred.setTotalLogins(100);
				System.out.println( cred.getTotalLogins());


				cred.setRewardPoints(500);
				System.out.println(cred.getRewardPoints());


				cred.setAccountBalance(1000.75);
				System.out.println( cred.getAccountBalance());


				cred.setGender('F');
				System.out.println( cred.getGender());


				cred.setAge(28);
				System.out.println(cred.getAge());

			}

		}


