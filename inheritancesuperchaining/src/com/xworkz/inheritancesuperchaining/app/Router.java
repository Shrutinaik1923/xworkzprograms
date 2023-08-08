package com.xworkz.inheritancesuperchaining.app;

public class Router {
	String name;
	String type;
	boolean provideTraffic;
	int price;
	
	public Router(String name,String type,boolean provideTraffic,int price)
	{   
		System.out.println("invoking String,String,boolean,int parameter in router constructor");
		this.name=name;
		this.type=type;
		this.provideTraffic=provideTraffic;
		this.price=price;
	}

}
