package com.xworkz.associationmethods.app;

public class Wood {
	public String type;
	public Paper paper;
	
	public Wood(String type,Paper paper)
	{
		this.type=type;
		this.paper=paper;
	}
	
	public void design()
	{
		System.out.println("invoking design() in Wood");
		this.paper.write();
	}

}
