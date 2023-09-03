package com.xworkz.associationmethods.app;

public class Processor {
	public void speed()
	{
		System.out.println("inovoking speed() in Processor");
		size();
	}
	
	public void size()
	{
		System.out.println("Invoking size() in Processor");
		capacity();
	}
	
	public void capacity()
	{
		System.out.println("ivnoking capacity() in Processor");
		leftSpace();
	}
	
	public void leftSpace()
	{
		System.out.println("invoking leftSpace() in Processor");
	}


}
