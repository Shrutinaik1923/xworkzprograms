package com.xworkz.app.accessspecifier;

public class BlackBoxTheatre extends Theatre{
	@Override
	public void entertainment()
	{
		System.out.println("invoking entertainment with no-arguements in Theatre");
	}
	public void entertainment(String location)
	{
		System.out.println("invoking store with(String) in Theatre");
		System.out.println("location is:"+location);
	}
	public void entertainment(int showPrice)
	{
		System.out.println("invoking store with (int) in Theatre");
		System.out.println("showPrice is:"+showPrice);
	}
	public void entertainment(String movieName,int startShow)
	{
		System.out.println("invoking store with(String) in Theatre");
		System.out.println("movieName is:"+movieName+"startShow is:"+startShow);
		
	}
	public void entertainment(int closingTime,boolean enjoyed)
	{
		System.out.println("invoking store with (String,int) in Theatre");
		System.out.println("closingTime is:"+closingTime+enjoyed +enjoyed); 
		
	}
	public void entertainment(String name,char size,int openingTime,int closingTime)
	{
		System.out.println("invoking store with (String,char,int,int) in Theatre");
		System.out.println("name is:"+name+"size is:"+size+"closingTime is:+closingTime");

	}
	

}
