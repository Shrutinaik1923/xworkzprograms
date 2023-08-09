package com.xworkz.app.accessspecifier;

public class AquariumZoo extends Zoo{
	@Override
	public void entertain()
	{
		System.out.println("invoking entertain with no-arguements in Zoo");
	}
	public void entertain(String name)
	{
		System.out.println("invoking entertain with(String) in Zoo");
		System.out.println("name is:"+name);
	}
	public void entertain(int openingTime)
	{
		System.out.println("invoking entertain with (int) in Zoo");
		System.out.println("openingTime is:"+openingTime);
	}
	public void entertain(int openingTime,boolean isGoodMarket)
	{
		System.out.println("invoking entertain with(int,boolean) in Zoo");
		System.out.println("openingTime is:"+openingTime+ isGoodMarket +isGoodMarket);
		
	}
	public void entertain(int closingTime, String location)
	{
		System.out.println("invoking entertain with (String,int) in Zoo");
		System.out.println("closingTime is:"+closingTime+"location is:" +location); 
		
	}
	public void entertain(String name,String location,int openingTime,int closingTime)
	{
		System.out.println("invoking entertain with (String,char,int,int) in Zoo");
		System.out.println("name is:"+name+"location is:"+location+"openingTime is:"+openingTime+"closingTime is:"+closingTime);


}
}