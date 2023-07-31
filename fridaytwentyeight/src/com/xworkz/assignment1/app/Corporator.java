package com.xworkz.assignment1.app;

public class Corporator {
	public String name;
	public Buiding[] buiding;
	
	public  Corporator(String name,Buiding[] buiding)
	{
		this.name=name;
		this.buiding=buiding;
	}
	public void PrintInfo()
	{
		System.out.println("name is:"+name);
		for(int i=0;i<this.buiding.length;i++)
		{
			Buiding ref=buiding[i];
			ref.printInfo();
		}
	}

}
