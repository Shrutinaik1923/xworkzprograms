package com.xworkz.associationmethods.app;

public class Passanger {

	public String name;
	public Bus bus;
	
	public Passanger(String name,Bus bus)
	{
		this.name=name;
		this.bus=bus;
	}
	
	public void travel()
	{
		System.out.println("invoking travel() in Passanger");
		this.bus.source();
	}

}
