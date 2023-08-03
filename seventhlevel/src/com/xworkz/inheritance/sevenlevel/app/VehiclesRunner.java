package com.xworkz.inheritance.sevenlevel.app;

public class VehiclesRunner {
	public static void main(String[] args) {
		System.out.println("Running main");
		
		TeslaModelSPlaidPlus model=new TeslaModelSPlaidPlus();
		
		
		model.activateSpoiler();
		model.batteryCapacity();
		model.chargingCapacity();
		model.drive();
		model.charge();
		model.leatherInterior();
	}

}
