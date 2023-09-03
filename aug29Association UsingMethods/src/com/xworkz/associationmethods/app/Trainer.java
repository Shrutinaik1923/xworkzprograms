package com.xworkz.associationmethods.app;

public class Trainer {
	private String name;
	public Laptop lap;
	
	public Trainer(String name,Laptop lap)
	{
		this.name=name;
		this.lap=lap;
	}

	
	public void teach()
	{
		System.out.println("Invoking teach() in Trainer");
		this.lap.works();
	}

}
