package com.xworkz.assignment1.app;

public class Lift {
	public int liftNo;
	
	public Lift(int liftNo)
	{
		this.liftNo=liftNo;
	}
	
	public void PrintInfo()
	{
		System.out.println("invoking printInfo in Lift");
		System.out.println("Lift number is:"+liftNo);
	}

}
