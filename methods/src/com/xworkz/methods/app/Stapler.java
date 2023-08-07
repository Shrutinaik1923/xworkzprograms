package com.xworkz.methods.app;

public class Stapler {
	String brandName;
	int price;
	public void joiningPapers()
	{
		System.out.println("invoking joiningPapers with no-arguements");
		joiningPapers("Swingline");
		joiningPapers(40);
		
	}
	public void joiningPapers(String brandName)
	{
		System.out.println("invoking joiningPapers with String");
		System.out.println("brandName is:"+brandName);
	}
	public void joiningPapers(int price)
	{
		System.out.println("invoking joiningPpaers with int");
	    System.out.println("price is:+price");

	}
	public void joiningPapers(String brandName,int price)
	{
		System.out.println("invoking joiningPapers with String and brand");
		System.out.println("brandName is:"+brandName+"price is:"+price);
	}
	

}
