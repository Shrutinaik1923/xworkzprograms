package com.xworkz.methods.app;

public class Gadget {
	public String type;
	public int price;
	public void computing()
	{
		System.out.println("invoking no-arguements in gadgets");
		computing("SmartWatch");
		computing();
	}
	public void computing(String type)
	{
		System.out.println("invoking gadget with string");
		System.out.println("type is:"+type);
		
	}
	public void computing(int price)
	{
		System.out.println("invoking gadget with int");
		System.out.println("price is:"+price);
	}
	public void computing(String type,int price)
	{
		System.out.println("invoking String,int in gadgets");
		System.out.println("type is:"+type+"price is:"+price);
	}
	

}
