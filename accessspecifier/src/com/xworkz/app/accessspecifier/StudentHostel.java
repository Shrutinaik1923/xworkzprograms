package com.xworkz.app.accessspecifier;

public class StudentHostel extends Hostel {
	@Override
	public void security()
	{
		System.out.println("invoking no-arguement in Hostel");
	}
	public void security(String name)
	{
		System.out.println("invoking String in Hostel");
		System.out.println("name is:"+name);
	}
	public void security(int price)
	{
		System.out.println("invoking int arguement in Hostel");
		System.out.println("price is:"+price);
	}
	public void security(String type,int price)
	{
		System.out.println("invoking security(String,int) in Hostel");
		System.out.println("type is:"+type+"price is :"+price);
	}
	public void security(String name,String type,int price)
	{
		System.out.println("invoking security(String,String,int) in Hostel");
		System.out.println("name is:" +name+ "type is:" +type+ "price is:" +price);
	}
	

}
