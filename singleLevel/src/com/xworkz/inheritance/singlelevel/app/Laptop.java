package com.xworkz.inheritance.singlelevel.app;

public class Laptop extends Computer 
{  
	public String brand="Asus";
	public Laptop()
	{
		System.out.println("No arg constructor of Laptop");
		System.out.println("brand is:"+brand);
	}
	public void shutDown()
	{
		System.out.println("Invoking shutdown method in Laptop");
	}

}
