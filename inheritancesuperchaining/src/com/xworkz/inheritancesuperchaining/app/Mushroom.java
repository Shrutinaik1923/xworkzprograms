package com.xworkz.inheritancesuperchaining.app;

public class Mushroom {
	String colour;
	char size;
	int price;
	boolean eidible;
	
	public Mushroom(String colour,char size,int price,boolean eidible)
	{   
		System.out.println("invoking String,int,char,boolean in Mushroom");
		this.colour=colour;
		this.size=size;
		this.price=price;
		this.eidible=eidible;
	}

}
