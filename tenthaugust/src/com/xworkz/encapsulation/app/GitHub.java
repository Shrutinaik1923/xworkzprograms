package com.xworkz.encapsulation.app;

public class GitHub {
	
			private String developCompany;
			private int startedYear;
			private float latestVersion;
			private String username;
		    private int repositories;
		    private int followers;
		    private int following;
		    private boolean isVerified;
		    private long joinedDate;
		    private String bio;
		    private String email;
		    private int contributions;
		    private String website;
		    private boolean isStudent;

		    public String getDevelopCompany() {
		    	return this.developCompany;
		    }

		    public void setDevelopCompany(String developCompany) {
		    	this.developCompany=developCompany;
		    }

		    public int getStartedYear() {
		    	return this.startedYear;
		    }

		    public void setStartedYear(int startedYear) {
		    	this.startedYear=startedYear;
		    }

		    public float getLatestVersion() {
		    	return this.latestVersion;
		    }

		    public void setLatestVersion(float latestVersion) {
		    	this.latestVersion=latestVersion;
		    }

		    public String getUsername() {
		            return username;
		        }

		    public void setUsername(String username) {
		            this.username = username;
		        }

		    public int getRepositories() {
		            return repositories;
		    }

		    public void setRepositories(int repositories) {
		            this.repositories = repositories;
		    }

		        public int getFollowers() {
		            return followers;
		        }

		        public void setFollowers(int followers) {
		            this.followers = followers;
		        }

		        public int getFollowing() {
		            return following;
		        }

		        public void setFollowing(int following) {
		            this.following = following;
		        }

		        public boolean isVerified() {
		            return isVerified;
		        }

		        public void setVerified(boolean isVerified) {
		            this.isVerified = isVerified;
		        }

		        public long getJoinedDate() {
		            return joinedDate;
		        }

		        public void setJoinedDate(long joinedDate) {
		            this.joinedDate = joinedDate;
		        }

		        public String getBio() {
		            return bio;
		        }

		        public void setBio(String bio) {
		            this.bio = bio;
		        }

		        public String getEmail() {
		            return email;
		        }

		        public void setEmail(String email) {
		            this.email = email;
		        }

		        public int getContributions() {
		            return contributions;
		        }

		        public void setContributions(int contributions) {
		            this.contributions = contributions;
		        }

		        public String getWebsite() {
		            return website;
		        }

		        public void setWebsite(String website) {
		            this.website = website;
		        }

		        public boolean isStudent() {
		            return isStudent;
		        }

		        public void setStudent(boolean isStudent) {
		            this.isStudent = isStudent;
		        }
}
