package com.xworkz.assignment1.app;

public class PowerBank {
 
   Battery battery = new Battery();
	
	public void ports() {
		System.out.println("power bank");
		
		this.battery.batteryName();
		this.battery.batteryWolts();
		
		if(this.battery != null) {
			System.out.println("battery points to memory");
		}
		else {
			System.out.println("NullPointerEception");
		}
	}	


}
