package com.xworkz.assignment1.app;

public class Company {
	String name;
	String ceo;
	String originCountry;
	
	public Company(String name,String ceo,String originCountry)
	{
	this.name=name;
	this.ceo=ceo;
	this.originCountry=originCountry;
	}
	public void printInfo()
	{
		System.out.println("invoking printInfo in Company");
		System.out.println("name:"+name);
		System.out.println("ceo ia:"+ceo);
		System.out.println("originCountry is:"+originCountry);
	}

}
