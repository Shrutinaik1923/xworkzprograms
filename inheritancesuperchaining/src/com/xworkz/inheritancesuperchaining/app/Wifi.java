package com.xworkz.inheritancesuperchaining.app;

public class Wifi extends Router {
	
	public Wifi()
	{  
		this("NetGear","wireless",true,380);
		System.out.println("invoking no-argu constructor in wifi");
	}
	
	public Wifi(String name,String type,boolean provideTraffic,int price) 
	{
	     super("NetGear","wireless",true,380);
	     System.out.println("invoking string,boolean,int arguments in Constructor wifi");
	}

}
