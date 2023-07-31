package com.xworkz.assignment1.app;

public class HomeTown {
	public String name;
	public int pincode;
	public Area[] area;
	
	public HomeTown(String name,int pincode,Area[] area)
	{
		this.name=name;
		this.pincode=pincode;
		this.area=area;
	}
	public void printInfo()
	{
		System.out.println("invoking PrintInfo in HomeTown");
		System.out.println("homeTown name:"+name);
		System.out.println("pincode is:"+pincode);
		for(int i=0;i<this.area.length;i++)
		{
			Area ref=this.area[i];
			ref.printInfo();
		}
	}

}
