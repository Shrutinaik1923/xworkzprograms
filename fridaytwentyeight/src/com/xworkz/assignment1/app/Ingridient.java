package com.xworkz.assignment1.app;

public class Ingridient {
	public String name;
	public int quantity;
	public int cost;
	
	public Ingridient(String name,int quantity,int cost)
	{
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
	}
	public void printInfo()
	{
		
		System.out.println("invoking printInfo in ingridients");
		System.out.println("name is:"+name);
		System.out.println("quantity is:"+quantity);
		System.out.println("cost is:"+cost);
	}
	

}
