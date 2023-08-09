package com.xworkz.app.accessspecifier;

public class CentralPoliceStation extends PoliceStation {
	@Override
	public void investigation()
	{
		System.out.println("invoking sell with no-arguements in Street");
	}
	public void investigation(String name)
	{
		System.out.println("invoking sell with(String) in Street");
		System.out.println("name is:"+name);
	}
	public void investigation(int noOfPolice)
	{
		System.out.println("invoking sell with (int) in Street");
		System.out.println("noOfPolice is:"+noOfPolice);
	}
	public void investigation(String name,long prisoner)
	{
		System.out.println("invoking sell with(int,boolean) in Street");
		System.out.println("name is:"+name+ prisoner +prisoner);
		
	}
	public void investigation(int noOfCases,char size)
	{
		System.out.println("invoking sell with (String,int) in Street");
		System.out.println("noOfCases:"+noOfCases+"size is:" +size); 
		
	}
	public void investigation(String name,int noOfPolice)
	{
		System.out.println("invoking sell with (String,char,int,int) in Street");
		System.out.println("name is:"+name+"noOfPolice:"+noOfPolice);
	}

}
