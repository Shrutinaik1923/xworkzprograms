package com.xworkz.stringInbuiltClass;

public class SystemRunner {

		public static void main(String[] args) {
			// Getting current time in milliseconds
			long currentTimeMillis = System.currentTimeMillis();
			System.out.println("Current Time (milliseconds): " + currentTimeMillis);

			// Copying elements from one array to another
			int[] sourceArray = { 1, 2, 3, 4, 5 };
			int[] destArray = new int[sourceArray.length];
			System.arraycopy(sourceArray, 0, destArray, 0, sourceArray.length);
			System.out.println("Destination Array: " + java.util.Arrays.toString(destArray));

			// Getting a system property
			String javaVersion = System.getProperty("java.version");
			System.out.println("Java Version: " + javaVersion);

			// Getting an environment variable
			String userHome = System.getenv("HOME");
			System.out.println("User Home Directory: " + userHome);

			// Terminating the program with a status code
			System.out.println("Terminating the program...");
			System.exit(0);
		}

	}