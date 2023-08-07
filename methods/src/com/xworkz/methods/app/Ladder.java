package com.xworkz.methods.app;

public class Ladder {
	String type;
	double weight;
	
	public void fold()
	{
		System.out.println("invoking no-arguements in ladder");
		fold("metal");
		fold(5.0d);
	}
	public void fold(String type)
	{
		System.out.println("invoking String in ladder");
		System.out.println("type is:"+type);
	}
	public void fold(double weight)
	{
		System.out.println("invoking double in Ladder");
		System.out.println("weight is:"+weight);
	}
	public void fold(String type,double weight)
	{
		System.out.println("invoking (String,double)in ladder");
		System.out.println("type is:"+type+"weight is:"+weight);
	}

}
