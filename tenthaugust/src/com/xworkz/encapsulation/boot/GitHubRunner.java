package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.GitHub;

public class GitHubRunner {


			public static void main(String[] args) {
				System.out.println("Running main in GitHubRunner");
		        GitHub gitHubProfile = new GitHub();

		        gitHubProfile.setDevelopCompany("Microsoft");
				System.out.println( gitHubProfile.getDevelopCompany());

				gitHubProfile.setStartedYear(2009);
				System.out.println( gitHubProfile.getStartedYear());

				gitHubProfile.setLatestVersion(25.20f);
				System.out.println(gitHubProfile.getLatestVersion());

		        gitHubProfile.setUsername("ThejaKumari");
		        System.out.println( gitHubProfile.getUsername());

		        gitHubProfile.setRepositories(20);
		        System.out.println( gitHubProfile.getRepositories());

		        gitHubProfile.setFollowers(150);
		        System.out.println( gitHubProfile.getFollowers());

		        gitHubProfile.setFollowing(100);
		        System.out.println( gitHubProfile.getFollowing());

		        gitHubProfile.setVerified(true);
		        System.out.println( gitHubProfile.isVerified());

		        gitHubProfile.setJoinedDate(20-05-2019);
		        System.out.println( gitHubProfile.getJoinedDate());

		        gitHubProfile.setBio("Fresher");
		        System.out.println(gitHubProfile.getBio());

		        gitHubProfile.setEmail("theja.xworkxz@gmail.com");
		        System.out.println( gitHubProfile.getEmail());

		        gitHubProfile.setContributions(500);
		        System.out.println( gitHubProfile.getContributions());

		        gitHubProfile.setWebsite("https://github.com/theja123");
		        System.out.println( gitHubProfile.getWebsite());

		        gitHubProfile.setStudent(false);
		        System.out.println( gitHubProfile.isStudent());

		    }

}
