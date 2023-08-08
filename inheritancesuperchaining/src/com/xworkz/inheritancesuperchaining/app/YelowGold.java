package com.xworkz.inheritancesuperchaining.app;

public class YelowGold extends Gold {
	public YelowGold()
	{
		this("Aurum",true,2000,"high");
		System.out.println("invoking no argument constructor in yelowGold");
		
	}
	public YelowGold(String name,boolean isMetal,int price,String density)
	{
		super("Aurum",true,2000,"high");
		System.out.println("invoking(String,boolean,int,String)in YelowGold");
		
	}

}
