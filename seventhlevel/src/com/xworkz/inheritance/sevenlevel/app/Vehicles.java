package com.xworkz.inheritance.sevenlevel.app;

public class Vehicles {
public int noOfWheels=6;
	
	public Vehicles() {
		System.out.println("invoking no arg constructor in Vehicle");
		System.out.println("Vehicle noOfWheels"+noOfWheels);
	}
	
	public void move() {
		System.out.println("invoking start in Vehicle");
	}

}
