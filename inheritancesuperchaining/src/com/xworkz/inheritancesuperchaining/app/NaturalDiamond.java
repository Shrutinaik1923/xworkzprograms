package com.xworkz.inheritancesuperchaining.app;

public class NaturalDiamond extends Diamond{
	public NaturalDiamond()
	{
		this("white",200,true,"Emerald");
		System.out.println("invoking no-argument cinstructor in NaturalDiamond");
	}
	public NaturalDiamond(String name,int price,boolean refraction,String type)
	{
		super("white",200,true,"Emerald");
		System.out.println("invoking arguement constructor in NaturalDiamond");
	}

}
