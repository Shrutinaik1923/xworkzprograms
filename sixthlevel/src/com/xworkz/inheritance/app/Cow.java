package com.xworkz.inheritance.app;

public class Cow {
	public String type="Brahman";
	
	public Cow() {
		System.out.println("invoking no arg construvtor in Cow");
		System.out.println("Cow type"+type);
	}
	
	public void giveMilk() {
		System.out.println("Invoking giveMilk in Cow");
	}

}
