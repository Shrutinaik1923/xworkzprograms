package com.xworkz.app.accessspecifier;

import com.xworkz.app.Hotel;

public class TajHotel extends Hotel {
	@Override
	public void prepareFood()
	{
		System.out.println("invoking no-arguement in bakery");
	}
	public void prepareFood(String name)
	{
		System.out.println("invoking String in bakery");
		System.out.println("name is:"+name);
	}
	public void prepareFood(int price)
	{
		System.out.println("invoking int arguement in bakery");
		System.out.println("price is:"+price);
	}
	public void prepareFood(String type,int price)
	{
		System.out.println("invoking prepareFood(String,int) in bakery");
		System.out.println("type is:"+type+"price is :"+price);
	}
	public void prepareFood(String name,String type,int price)
	{
		System.out.println("invoking prepareFood(String,String,int) in bakery");
		System.out.println("name is:" +name+ "type is:" +type+ "price is:" +price);
	}
}
