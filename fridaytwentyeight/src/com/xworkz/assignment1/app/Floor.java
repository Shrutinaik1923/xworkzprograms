package com.xworkz.assignment1.app;

public class Floor{
	public String name;
	public int number;
	
	public Floor(String name,int number)
	{
		this.name=name;
		this.number=number;
	}
	public void PrintInfo()
	{
		System.out.println("Invoking PrintInfo in Floor");
		System.out.println("Floor name is:"+name);
		System.out.println("Floor number is:"+number);
		
	}

}
