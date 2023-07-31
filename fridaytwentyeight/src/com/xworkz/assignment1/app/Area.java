package com.xworkz.assignment1.app;

public class Area {
	public String name;
	public Corporator corporator;
	
	public Area(String name,Corporator corporator)
	{
		this.name=name;
		this.corporator=corporator;
	}
	public void printInfo()
	{
		System.out.println("invoking PrintInfo in Area");
		System.out.println("area name is:"+name);
		System.out.println("############################");
		corporator.PrintInfo();
	}

}
