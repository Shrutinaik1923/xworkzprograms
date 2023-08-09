package com.xworkz.app.accessspecifier;

import com.xworkz.app.Temple;

public class HinduTemple extends Temple{
	@Override
	public void prayer()
	{
		System.out.println("invoking prayer with no-arguements in Temple");
	}
	public void prayer(String name)
	{
		System.out.println("invoking prayer with(String) in Temple");
		System.out.println("name is:"+name);
	}
	public void prayer(int openingTime)
	{
		System.out.println("invoking prayer with (int) in Temple");
		System.out.println("openingTime is:"+openingTime);
	}
	public void prayer(int openingTime,boolean prayWell)
	{
		System.out.println("invoking prayer with(int,boolean) in Temple");
		System.out.println("openingTime is:"+openingTime+ prayWell +prayWell);
		
	}
	public void prayer(int closingTime, String location)
	{
		System.out.println("invoking prayer with (String,int) in Temple");
		System.out.println("closingTime is:"+closingTime+"location is:" +location); 
		
	}
	public void prayer(String name,String location,int openingTime,int closingTime)
	{
		System.out.println("invoking prayer with (String,char,int,int) in Temple");
		System.out.println("name is:"+name+"location is:"+location+"openingTime is:"+openingTime+"closingTime is:"+closingTime);

	}

}
