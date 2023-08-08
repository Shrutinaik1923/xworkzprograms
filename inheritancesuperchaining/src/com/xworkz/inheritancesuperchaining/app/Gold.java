package com.xworkz.inheritancesuperchaining.app;

public class Gold {
	String name;
	boolean isMetal;
	int price;
	String density;
	
	public Gold(String name,boolean isMetal,int price,String density)
	{
		System.out.println("invoking no arguement constructor of gold");
		this.name=name;
		this.isMetal=isMetal;
		this.price=price;
		this.density=density;
	}
	

}
