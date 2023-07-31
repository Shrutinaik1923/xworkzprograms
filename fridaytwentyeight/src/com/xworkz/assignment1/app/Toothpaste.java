package com.xworkz.assignment1.app;

public class Toothpaste {
	public String name;
	public String brand;
	public Company company;
	public Ingridient[] ingridients;
	
	public Toothpaste(String name,String brand,Company company,Ingridient[] ingridients)
	{
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingridients=ingridients;
	}
	public void printInfo()
	{
		System.out.println("Invoking printInfo in Toothpaste");
		System.out.println("name :"+this.name);
		System.out.println("brand:"+this.brand);
		System.out.println("company:"+this.company);
		for(int i=0;i<this.ingridients.length;i++)
		{
			Ingridient ref=this.ingridients[i];
			ref.printInfo();
			
		}
		
		
		
	}
	

}
