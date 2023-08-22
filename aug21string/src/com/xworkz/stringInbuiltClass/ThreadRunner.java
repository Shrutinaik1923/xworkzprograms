package com.xworkz.stringInbuiltClass;

public class ThreadRunner {


		public static void main(String[] args) {
			Thread mainThread = Thread.currentThread();

			System.out.println("Thread Name: " + mainThread.getName());
			System.out.println("Thread ID: " + mainThread.getId());
			System.out.println("Thread Priority: " + mainThread.getPriority());
			System.out.println("Is Daemon Thread: " + mainThread.isDaemon());

		}

	}


