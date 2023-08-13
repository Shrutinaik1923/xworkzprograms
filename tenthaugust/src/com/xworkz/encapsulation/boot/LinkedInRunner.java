package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.LinkedIn;

public class LinkedInRunner {
	

			public static void main(String[] args) {

				System.out.println("Running main in LinkedinRunner ");
		        LinkedIn linkdein = new LinkedIn();

		        linkdein.setFullName("Thanu");
		        System.out.println(linkdein.getFullName());

		        linkdein.setHeadline("Electronic and Communication Student");
		        System.out.println( linkdein.getHeadline());

		        linkdein.setCountry("India");
		        System.out.println( linkdein.getCountry());

		        linkdein.setUniversity("VTU");
		        System.out.println(linkdein.getUniversity());

		        linkdein.setConnections(200);
		        System.out.println(linkdein.getConnections());

		        linkdein.setEmail("thanu@gmail.com");
		        System.out.println(linkdein.getEmail());

		        linkdein.setPhoneNumber("+91 9443356657");
		        System.out.println( linkdein.getPhoneNumber());

		        linkdein.setPremiumMember(false);
		        System.out.println( linkdein.isPremiumMember());

		        linkdein.setProfilePictureUrl("https://likedin.com/thanu.jpg");
		        System.out.println( linkdein.getProfilePictureUrl());

		        linkdein.setWebsite("https://www.lenkedin.com/thanu.h2002");
		        System.out.println( linkdein.getWebsite());

		        linkdein.setLanguages("English");
		        System.out.println( linkdein.getLanguages());

		        linkdein.setProjects("e_commerece website for farmers");
		        System.out.println(linkdein.getProjects());

		        linkdein.setCourses("Core Java, Web Development");
		        System.out.println(linkdein.getCourses());




		}


	}



