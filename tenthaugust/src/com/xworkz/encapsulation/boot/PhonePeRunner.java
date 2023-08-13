package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.PhonePe;

public class PhonePeRunner {
			public static void main(String[] args) {
				System.out.println("Running main in PhonePeRunner");

				PhonePe phonePe = new PhonePe();

				phonePe.setDevelopCompany("Meta");
				System.out.println(phonePe.getDevelopCompany());

				phonePe.setStartedYear(2009);
				System.out.println( phonePe.getStartedYear());

				phonePe.setLatestVersion(25.20f);
				System.out.println(phonePe.getLatestVersion());

				phonePe.setFullName("Adhi");
				System.out.println( phonePe.getFullName());

				phonePe.setPhoneNumber("8088170018");
				System.out.println(phonePe.getPhoneNumber());

				phonePe.setEmail("adhi@gmail.com");
				System.out.println( phonePe.getEmail());

				phonePe.setCoinsEarned(100);
				System.out.println( phonePe.getCoinsEarned());

				phonePe.setTransactions(100);
				System.out.println( phonePe.getTransactions());

				phonePe.setWalletBalance(15500.80);
				System.out.println( phonePe.getWalletBalance());

				phonePe.setReferralCode("PhoNE234");
				System.out.println( phonePe.getReferralCode());

				phonePe.setVerified(true);
				System.out.println( phonePe.isVerified());

				phonePe.setLinkedBankAccount("876756433423456");
				System.out.println( phonePe.getLinkedBankAccount());

				phonePe.setLinkedCards("VISA : 5678");
				System.out.println( phonePe.getLinkedCards());

				phonePe.setQrCodeUrl("https://phonepe.com/qr/adhi");
				System.out.println( phonePe.getQrCodeUrl());

			}
		}



