package com.xworkz.methods.app;

public class Specs{
	public String type;
	public int price;
	
	public void transmitLight()
	{
		System.out.println("invoking no-arguements in Specs");
		transmitLight("concave");
		transmitLight();
	}
	public void transmitLight(String type)
	{
		System.out.println("invoking String arguements in Specs");
		System.out.println("type is:"+type);
	}
	public void transmitLight(int price)
	{
		System.out.println("invoking int  arguements in Specs");
		System.out.println("pricet is:"+price);
	}
	public void transmitLight(String type,int price)
	{
	  System.out.println("invoking String,int arguements in Specs");
	  System.out.println("type is:"+type+"price is:"+price);
	}	
}
