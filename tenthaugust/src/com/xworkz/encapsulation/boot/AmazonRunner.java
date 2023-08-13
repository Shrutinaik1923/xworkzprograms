package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Amazon;

public class AmazonRunner {
	

		public static void main(String[] args) {

			Amazon amazon = new Amazon();


			amazon.setDevelopCompany("Amazon.com");
			System.out.println( amazon.getDevelopCompany());

			amazon.setStartedYear(1994);
			System.out.println( amazon.getStartedYear());


			amazon.setLatestVersion(32.52f);
			System.out.println(amazon.getLatestVersion());


			amazon.setFullName("Theja");
			System.out.println( amazon.getFullName());


			amazon.setUsername("Teju");
			System.out.println( amazon.getUsername());


			amazon.setEmail("teja@gmail.com");
			System.out.println( amazon.getEmail());


			amazon.setShippingAddress("122,Ujire,	Mangalore");
			System.out.println( amazon.getShippingAddress());


			amazon.setBillingAddress("Udupi");
			System.out.println( amazon.getBillingAddress());


			amazon.setPhoneNumber("8088170018");
			System.out.println( amazon.getPhoneNumber());


			amazon.setPaymentMethod("Credit Card");
			System.out.println( amazon.getPaymentMethod());


			amazon.setWishlistItemCount(10);
			System.out.println( amazon.getWishlistItemCount());


			amazon.setPrimeMember(true);
			System.out.println( amazon.isPrimeMember());


			amazon.setGiftCardCodes("AMZ123");
			System.out.println( amazon.getGiftCardCodes());


			amazon.setSubscriptionServices("Amazon Prime, Music Unlimited");
			System.out.println(amazon.getSubscriptionServices());


		}

	}


