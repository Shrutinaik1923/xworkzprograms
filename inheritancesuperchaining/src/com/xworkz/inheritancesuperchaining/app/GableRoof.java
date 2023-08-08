package com.xworkz.inheritancesuperchaining.app;

public class GableRoof extends Roof {
	public GableRoof()
	{
		this("metal","gray",true,2000L);
		System.out.println("invoking no arguement constructor in GableRoof");
	}
	public GableRoof(String type,String colour,boolean isDurable,int price)
	{
		super("metal","gray",true,2000L);
		System.out.println("invoking argument constructor in constructot of GableRoof");
	}

}
