package com.xworkz.app.accessspecifier;

public class Hostel {


	public void security()
	{
		System.out.println("invoking security withno-arguement in Hostel");
	}
	public void security(String name)
	{
		System.out.println("invoking String in bakery");
		System.out.println("name is:"+name);
	}
	public void security(int fees)
	{
		System.out.println("invoking fees arguement in bakery");
		System.out.println("price is:"+fees);
	}
	public void security(String type,int fees)
	{
		System.out.println("invoking prepareFood(String,int) in bakery");
		System.out.println("type is:"+type+"price is :"+fees);
	}
	public void security(String name,String type,int fees)
	{
		System.out.println("invoking prepareFood(String,String,int) in bakery");
		System.out.println("name is:" +name+ "type is:" +type+ "fees is:"+fees);
	}


}
