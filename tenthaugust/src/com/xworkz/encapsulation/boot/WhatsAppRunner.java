package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.WhatsApp;

public class WhatsAppRunner {
	

		public static void main(String[] args) {
			System.out.println("Invoking main in WhatsAppRunner");
			 WhatsApp whatsapp = new WhatsApp();
		        whatsapp.setUserName("Ashwin");
		        whatsapp.setPhoneNumber("8866578789");
		        whatsapp.setBlockUser(10);
		        whatsapp.setContact(250);
		        whatsapp.setGroup(12);
		        whatsapp.setLastSeen("10.05pm");
		        whatsapp.setMediaFolder(true);
		        whatsapp.setChat(25);
		        whatsapp.setOnlineStatus(true);
		        whatsapp.setProfilePicture("Image");
		        whatsapp.setStatus("All contact");
		        whatsapp.setUnreadMessage(25);
		        whatsapp.setNotificationSetting(true);
		        whatsapp.setPrivacySetting(true);

		        System.out.println(whatsapp.getBlockedUsers());
		        System.out.println(whatsapp.getUserName());  
		        System.out.println(whatsapp.getPhoneNumber());
	            System.out.println(whatsapp.getChats());
	            System.out.println(whatsapp.getContacts());
	            System.out.println(whatsapp.getGroups());
	            System.out.println(whatsapp.getLastSeen());
	            System.out.println(whatsapp.getMediaFolder());
	            //System.out.println(whatsapp.getMediaFolder());
	            System.out.println(whatsapp.getPrivacySettings());
	            System.out.println(whatsapp.getProfilePicture());
	            System.out.println(whatsapp.getStatus());
	            System.out.println(whatsapp.getUnreadMessages());
	            System.out.println(whatsapp.isOnlineStatus());
	            System.out.println(whatsapp.isOnlineStatus());
		}
	}



