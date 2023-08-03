package com.xworkz.inheritance.singlelevel.app;

public class Computer {
	public int ram;
	
	public Computer()
	{
		System.out.println("no-argu constructor of computer");
		System.out.println("computer ram:"+ram);	
	}
	public void turnOn()
	{
		System.out.println("invoking turnOn method in Computer");
	}

}
