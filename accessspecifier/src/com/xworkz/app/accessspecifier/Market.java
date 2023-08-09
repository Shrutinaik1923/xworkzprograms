package com.xworkz.app.accessspecifier;

public class Market {
	public void sell()
	{
		System.out.println("invoking sell with no-arguements in Market");
	}
	public void sell(String name)
	{
		System.out.println("invoking sell with(String) in Market");
		System.out.println("name is:"+name);
	}
	public void sell(int openingTime)
	{
		System.out.println("invoking sell with (int) in Market");
		System.out.println("openingTime is:"+openingTime);
	}
	public void sell(int openingTime,boolean isGoodMarket)
	{
		System.out.println("invoking sell with(int,boolean) in Market");
		System.out.println("openingTime is:"+openingTime+ isGoodMarket +isGoodMarket);
		
	}
	public void sell(int closingTime, String location)
	{
		System.out.println("invoking sell with (String,int) in Market");
		System.out.println("closingTime is:"+closingTime+"location is:" +location); 
		
	}
	public void sell(String name,String location,int openingTime,int closingTime)
	{
		System.out.println("invoking sell with (String,char,int,int) in Market");
		System.out.println("name is:"+name+"location is:"+location+"openingTime is:"+openingTime+"closingTime is:"+closingTime);

	}

}
