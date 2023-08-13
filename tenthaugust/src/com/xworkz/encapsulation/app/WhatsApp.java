package com.xworkz.encapsulation.app;

public class WhatsApp {

		    private String userName;
		    private String phoneNumber;
		    private String status;
		    private String profilePicture;
		    private String lastSeen;
		    private int contacts;
		    private int chats;
		    private int groups;
		    private int blockedUsers;
		    private int unreadMessages;
		    private boolean mediaFolder;
		    private boolean privacySettings;
		    private boolean notificationSettings;
		    private boolean onlineStatus;



		    public String getUserName() {
		        return userName;
		    }

		    public void setUserName(String userName) {
		        this.userName = userName;
		    }

		    public String getPhoneNumber() {
		        return phoneNumber;
		    }

		    public void setPhoneNumber(String phoneNumber) {
		        this.phoneNumber = phoneNumber;
		    }

		    public String getStatus() {
		        return status;
		    }

		    public void setStatus(String status) {
		        this.status = status;
		    }

		    public String getProfilePicture() {
		        return profilePicture;
		    }

		    public void setProfilePicture(String profilePicture) {
		        this.profilePicture = profilePicture;
		    }

		    public String getLastSeen() {
		        return this.lastSeen;
		    }

		    public void setLastSeen(String lastSeen) {
		        this.lastSeen = lastSeen;
		    }

		    public int getContacts() {
		        return this.contacts;
		    }

		    public void setContact(int contacts) {
		        this.contacts=contacts;
		    }

		    public int getChats() {
		        return this.chats;
		    }

		    public void setChat(int chats) {
		        this.chats=chats;
		    }

		    public int getGroups() {
		        return this.groups;
		    }
		    public void setGroup(int groups) {
		        this.groups=groups;
		    }


		    public int  getBlockedUsers() {
		        return this.blockedUsers;
		    }


		    public void setBlockUser(int blockedUsers) {
		        this.blockedUsers=blockedUsers;
		    }

		    public int  getUnreadMessages() {
		        return this.unreadMessages;
		    }

		    public void setUnreadMessage( int unreadMessages) {
		        this.unreadMessages=unreadMessages;
		    }

		    public boolean getMediaFolder() {
		        return this.mediaFolder;
		    }

		    public void setMediaFolder(boolean mediaFolder) {
		        this.mediaFolder = mediaFolder;
		    }

		    public boolean getPrivacySettings() {
		        return this.privacySettings;
		    }

		    public void setPrivacySetting(boolean privacySettings) {
		        this.privacySettings=privacySettings;
		    }

		    public boolean isNotificationSettings() {
		        return notificationSettings;
		    }

		    public void setNotificationSetting(boolean notificationSettings) {
		        this.notificationSettings=notificationSettings;
		    }

		    public boolean isOnlineStatus() {
		        return onlineStatus;
		    }

		    public void setOnlineStatus(boolean onlineStatus) {
		        this.onlineStatus = onlineStatus;
		    }


		}

	
	


