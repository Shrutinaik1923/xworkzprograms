package com.xworkz.app.accessspecifier;

public class LuluMall extends Mall{
	@Override
	public void store()
	{
		System.out.println("invoking store with no-arguements in Mall");
	}
	public void store(String name)
	{
		System.out.println("invoking store with(String) in Mall");
		System.out.println("name is:"+name);
	}
	public void store(char size)
	{
		System.out.println("invoking store with (char) in Mall");
		System.out.println("size is:"+size);
	}
	public void store(int openingTime)
	{
		System.out.println("invoking store with(int) in Mall");
		System.out.println("openingTime is:"+openingTime);
		
	}
	public void store(String location,int closingTime)
	{
		System.out.println("invoking store with (String,int) in Mall");
		System.out.println("lolocation is:"+location+"closingTime is:+closingTime");

		
	}
	public void store(String name,char size,int openingTime,int closingTime)
	{
		System.out.println("invoking store with (String,char,int,int) in Mall");
		System.out.println("name is:"+name+"size is:"+size+"closingTime is:+closingTime");

	}
	
}
