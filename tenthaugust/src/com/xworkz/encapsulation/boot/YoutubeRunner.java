package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.Youtube;

public class YoutubeRunner {
		public static void main(String[] args) {
			System.out.println("Running main in YouTubeRunner ");
			Youtube channel = new Youtube();

			channel.setDevelopCompany("sAN BRUNO");
			System.out.println( channel.getDevelopCompany());

			channel.setStartedYear(2005);
			System.out.println( channel.getStartedYear());

			channel.setLatestVersion(25.20f);
			System.out.println(channel.getLatestVersion());

			channel.setChannelName("TechExplorers");
			System.out.println(channel.getChannelName());

			channel.setUsername("techexplorers");
			System.out.println( channel.getUsername());

			channel.setEmail("contact@techexplorers.com");
			System.out.println(channel.getEmail());

			channel.setSubscribersCount(50000);
			System.out.println(channel.getSubscribersCount());

			channel.setVideosUploaded(100);
			System.out.println( channel.getVideosUploaded());

			channel.setViewsCount(1000000);
			System.out.println(channel.getViewsCount());

			channel.setCountry("India");
			System.out.println( channel.getCountry());

			channel.setWebsite("https://www.techexplorers.com");
			System.out.println(channel.getWebsite());

			channel.setVerified(true);
			System.out.println( channel.isVerified());

			channel.setAbout("TechExplorers is a channel dedicated to showcasing the coolest tech innovations and gadgets.");
			System.out.println( channel.getAbout());

			channel.setJoinDate("July 1,2019");
			System.out.println( channel.getJoinDate());

		}

	}



