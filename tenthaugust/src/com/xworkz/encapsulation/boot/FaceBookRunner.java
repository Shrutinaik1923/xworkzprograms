package com.xworkz.encapsulation.boot;

import com.xworkz.encapsulation.app.FaceBook;

public class FaceBookRunner {
	


			public static void main(String[] args) {
				System.out.println("Running main in FacebookRunner:");
		        FaceBook faceBook = new FaceBook();


		        faceBook.setFullName("Swasthik");
		        System.out.println( faceBook.getFullName());


		        faceBook.setUsername("swasthik");
		        System.out.println( faceBook.getUsername());

		        faceBook.setEmail("swasthik@gmail.com");
		        System.out.println( faceBook.getEmail());

		        faceBook.setFriendCount(500);
		        System.out.println( faceBook.getFriendCount());

		        faceBook.setPostsCount(100);
		        System.out.println( faceBook.getPostsCount());
		        faceBook.setPhotosCount(300);
		        System.out.println(faceBook.getPhotosCount());

		        faceBook.setBio("Tech enthusiast and travel lover.");
		        System.out.println( faceBook.getBio());

		        faceBook.setVerified(true);
		        System.out.println( faceBook.isVerified());

		        faceBook.setLocation("Ujire");
		        System.out.println(faceBook.getLocation());

		        faceBook.setEducation("VTU-Computer Science");
		        System.out.println( faceBook.getEducation());

		        faceBook.setBirthday("Feb 1, 2001");
		        System.out.println( faceBook.getBirthday());

		        faceBook.setAge(22);
		        System.out.println( faceBook.getAge());

		        faceBook.setFriendRequests(5);
		        System.out.println( faceBook.getFriendRequests());

		        faceBook.setActive(true);
		        System.out.println(faceBook.isActive());


		    }

		}



