package com.xworkz.associationmethods.app;

public class Mobile {
	public String model;
	Charger charger;
	
	public Mobile(String model,Charger charger)
	{
		this.model=model;
		this.charger=charger;
	}
	
	public void runApps()
	{
		System.out.println("Invoking runApps() in Mobile");
		this.charger.type();
		call();
	}
	
	public void call()
	{
		System.out.println("invoking calls() in Mobile");
		connect();
	}
	
	public void connect()
	{
		System.out.println("Invoking connect() in Mobile");
		settings();
	}
	
	public void settings()
	{
		System.out.println("Invoking settings() in Mobile");
	}

}
