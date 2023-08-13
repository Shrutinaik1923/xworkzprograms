package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Snapchat;

public class SnapchatRunner {
	


			public static void main(String[] args) {
		        Snapchat snapchatProfile = new Snapchat();


		        snapchatProfile.setDevelopCompany("Snap");
				System.out.println( snapchatProfile.getDevelopCompany());

				snapchatProfile.setStartedYear(2011);
				System.out.println(snapchatProfile.getStartedYear());


				snapchatProfile.setLatestVersion(12.40f);
				System.out.println(snapchatProfile.getLatestVersion());


		        snapchatProfile.setUsername("Seemitha");
		        System.out.println( snapchatProfile.getUsername());


		        snapchatProfile.setFriendsCount(300);
		        System.out.println( snapchatProfile.getFriendsCount());


		        snapchatProfile.setSnapsSent(500);
		        System.out.println( snapchatProfile.getSnapsSent());


		        snapchatProfile.setVerified(true);
		        System.out.println(snapchatProfile.isVerified());


		        snapchatProfile.setSnapScore(1234.56);
		        System.out.println( snapchatProfile.getSnapScore());


		        snapchatProfile.setRegistrationDate(23-07-2020);
		        System.out.println( snapchatProfile.getRegistrationDate());


		        snapchatProfile.setBio("Snapchat lover");
		        System.out.println(snapchatProfile.getBio());


		        snapchatProfile.setEmail("seemitha@example.com");
		        System.out.println( snapchatProfile.getEmail());


		        snapchatProfile.setAge(22);
		        System.out.println(snapchatProfile.getAge());


		        snapchatProfile.setGender("Female");
		        System.out.println( snapchatProfile.getGender());


		        snapchatProfile.setLocation("Udupi");
		        System.out.println( snapchatProfile.getLocation());




		    }


		}



