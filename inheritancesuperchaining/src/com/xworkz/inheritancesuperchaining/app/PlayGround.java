package com.xworkz.inheritancesuperchaining.app;

public class PlayGround extends Ground{
	
	public PlayGround()
	{    
		this("Tower PlayGround","Denmark",'m',"green");
		System.out.println("invoking no arg constructor of PlayGround");
	
	}
	public PlayGround(String name,String loaction,char size,String colour)
	{
		super("Tower PlayGround","Denmark",'m',"green");
		System.out.println("invoking(String,String,char,String)in constructor PlayGround");
	}

}
