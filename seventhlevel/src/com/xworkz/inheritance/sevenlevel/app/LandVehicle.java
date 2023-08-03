package com.xworkz.inheritance.sevenlevel.app;

public class LandVehicle extends Vehicles {
public String type;
	
	public LandVehicle() {
		System.out.println("invoking no arg constructor in LandVehicle");
		System.out.println("LandVehicle type"+type);
	}
	
	public void stop() {
		System.out.println("invoking stop in LandVehicle");
	}

}
