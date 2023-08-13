package com.xworkz.encapsulation.app;

public class Instagram {
	 private String userName;
		    private String phoneNumber;
		    private String story;
		    private String profilePicture;
		    private String lastSeen;
		    private int followers;
		    private int chats;
		    private int following;
		    private int blockedUsers;
		    private int unreadreels;
		    private int noOfPosts;
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

		    public String getStory() {
		        return story;
		    }

		    public void setStatus(String story) {
		        this.story = story;
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

		    public int getFollowers() {
		        return this.followers;
		    }

		    public void setFollowers(int followers) {
		        this.followers=followers;
		    }

		    public int getChats() {
		        return this.chats;
		    }

		    public void setChat(int chats) {
		        this.chats=chats;
		    }

		    public int getFollowing() {
		        return this.following;
		    }
		    public void setFollowing(int following) {
		        this.following=following;
		    }


		    public int  getBlockedUsers() {
		        return this.blockedUsers;
		    }


		    public void setBlockUser(int blockedUsers) {
		        this.blockedUsers=blockedUsers;
		    }

		    public int  getUnreadreels() {
		        return this.unreadreels;
		    }

		    public void setUnreadreels( int unreadreels) {
		        this.unreadreels=unreadreels;
		    }

		    public int getNoOfPosts() {
		        return this.noOfPosts;
		    }

		    public void setNoOfPosts(int noOfPosts) {
		        this.noOfPosts = noOfPosts;
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
