package com.xworkz.associationmethods.app;

public class Pant {

	public String material;
	public Zip zip;
	
	public Pant(String material,Zip zip)
	{
		this.material=material;
		this.zip=zip;
	}

	public void type()
	{
		System.out.println("invoking type() in Pant");
		this.zip.length();
	}

}
