package com.xworkz.app.accessspecifier;

public class PoliceStation {
	public void investigation()
	{
		System.out.println("invoking investigation with no-arguements in PoliceStation");
	}
	public void investigation(String name)
	{
		System.out.println("invoking investigation with(String) in PoliceStation");
		System.out.println("name is:"+name);
	}
	public void investigation(int noOfPolice)
	{
		System.out.println("invoking investigation with (int) in PoliceStation");
		System.out.println("noOfPolice is:"+noOfPolice);
	}
	public void investigation(String name,long prisoner)
	{
		System.out.println("invoking investigation with(int,boolean) in PoliceStation");
		System.out.println("name is:"+name+ prisoner +prisoner);
		
	}
	public void investigation(int noOfCases,char size)
	{
		System.out.println("invoking investigation with (String,int) in PoliceStation");
		System.out.println("noOfCases:"+noOfCases+"size is:" +size); 
		
	}
	public void investigation(String name,int noOfPolice)
	{
		System.out.println("invoking investigation with (String,char,int,int) in PoliceStation");
		System.out.println("name is:"+name+"noOfPolice:"+noOfPolice);
	}

}
