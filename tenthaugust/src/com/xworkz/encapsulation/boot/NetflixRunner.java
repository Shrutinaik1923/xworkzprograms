package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Netflix;

public class NetflixRunner {
		public static void main(String[] args) {

			System.out.println("Running main in NetflixRunner:");
	        Netflix netflix = new Netflix();

	        netflix.setAccountHolderName("Anish Kumar");
	        System.out.println( netflix.getAccountHolderName());

	        netflix.setSubscriptionPlan("Premium");
	        System.out.println( netflix.getSubscriptionPlan());

	        netflix.setPaymentMethod("Credit Card");
	        System.out.println( netflix.getPaymentMethod());

	        netflix.setDevicesAllowed(4);
	        System.out.println( netflix.getDevicesAllowed());

	        netflix.setActive(true);
	        System.out.println( netflix.isActive());

	        netflix.setProfilePictureUrl("https://netflix.com/anish.jpg");
	        System.out.println(netflix.getProfilePictureUrl());

	        netflix.setTotalWatchedHours(50);
	        System.out.println(netflix.getTotalWatchedHours());

	        netflix.setPremium(true);
	        System.out.println( netflix.isPremium());

	        netflix.setPreferredLanguage("English");
	        System.out.println( netflix.getPreferredLanguage());

	        netflix.setAccountAgeMonths(12);
	        System.out.println(netflix.getAccountAgeMonths());

	        netflix.setMonthlyPayment(15);
	        System.out.println( netflix.getMonthlyPayment());

	        netflix.setBillingAddress("Kaleja,Ujire");
	        System.out.println(netflix.getBillingAddress());

	        netflix.setWatchlist("Movie C, Show D");
	        System.out.println( netflix.getWatchlist());

	        netflix.setHasDownloads(true);
	        System.out.println( netflix.isHasDownloads());



	    }

	}



