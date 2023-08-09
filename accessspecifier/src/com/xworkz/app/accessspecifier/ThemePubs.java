package com.xworkz.app.accessspecifier;

public class ThemePubs extends Pub {
    @Override
    public void meet()
	{
		System.out.println("invoking sell with no-arguements in Street");
	}
	public void meet(String name)
	{
		System.out.println("invoking sell with(String) in Street");
		System.out.println("name is:"+name);
	}
	public void meet(float distance)
	{
		System.out.println("invoking sell with (float) in Street");
		System.out.println("distance is:"+distance);
	}
	public void meet(int width,boolean isGoodStreet)
	{
		System.out.println("invoking sell with(int,boolean) in Street");
		System.out.println("width is:"+width+ isGoodStreet +isGoodStreet);
		
	}
	public void meet(int distance, String location)
	{
		System.out.println("invoking sell with (String,int) in Street");
		System.out.println("distance is:"+distance+"location is:" +location); 
		
	}
	public void meet(String name,String location,int distance)
	{
		System.out.println("invoking sell with (String,char,int,int) in Street");
		System.out.println("name is:"+name+"location is:"+location+"distance is:"+distance);
	}
}
