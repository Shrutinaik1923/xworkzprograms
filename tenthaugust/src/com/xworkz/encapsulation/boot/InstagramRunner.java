package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Instagram;

public class InstagramRunner {

		public static void main(String[] args) {
			System.out.println("Invoking main in InstagramRunner");
			Instagram instagram = new Instagram();
			instagram.setUserName("Ashwini");
			instagram.setPhoneNumber("8866578789");
			instagram.setBlockUser(10);
			instagram.setFollowers(550);
			instagram.setFollowing(233);
			instagram.setLastSeen("10.05pm");
			instagram.setStatus("Charmady Ghat");
			instagram.setChat(25);
			instagram.setOnlineStatus(true);
			instagram.setProfilePicture("Image");
			instagram.setNoOfPosts(20);
			instagram.setUnreadreels(25);
			instagram.setNotificationSetting(true);
			instagram.setPrivacySetting(true);

			System.out.println(instagram.getBlockedUsers());
			System.out.println(instagram.getUserName());
			System.out.println(instagram.getPhoneNumber());
			System.out.println(instagram.getChats());
			System.out.println(instagram.getFollowing());
			System.out.println(instagram.getFollowers());
			System.out.println(instagram.getLastSeen());
			System.out.println(instagram.getNoOfPosts());
			// System.out.println(whatsapp.getMediaFolder());
			System.out.println(instagram.getPrivacySettings());
			System.out.println(instagram.getProfilePicture());
			System.out.println(instagram.isNotificationSettings());
			System.out.println(instagram.getUnreadreels());
			System.out.println(instagram.isOnlineStatus());
			System.out.println(instagram.getStory());
		}

	}



