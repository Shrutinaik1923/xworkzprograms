package com.xworkz.associationmethods.app;

public class Shirt {
	public char size;
	public Button button;
	
	public Shirt(char size,Button button)
	{
		this.size=size;
		this.button=button;
	}
	
	public void wear()
	{
		System.out.println("invoking wear() in Shirt");
		this.button.noOfButtons();
	}

}
