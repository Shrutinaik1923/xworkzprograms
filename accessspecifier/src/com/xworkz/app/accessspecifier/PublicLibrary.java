package com.xworkz.app.accessspecifier;

public class PublicLibrary extends Library{
	@Override
	public void groupStudy()
	{
		System.out.println("invoking groupStudy with no-arguements in Library");
	}
	public void groupStudy(String name)
	{
		System.out.println("invoking groupStudy with(String) in Library");
		System.out.println("name is:"+name);
	}
	public void groupStudy(int openingTime)
	{
		System.out.println("invoking groupStudy with (int) in Library");
		System.out.println("openingTime is:"+openingTime);
	}
	public void groupStudy(int openingTime,boolean learntWell)
	{
		System.out.println("invoking groupStudy with(int,boolean) in Library");
		System.out.println("openingTime is:"+openingTime+ learntWell +learntWell);
		
	}
	public void groupStudy(int closingTime, char size)
	{
		System.out.println("invoking groupStudy with (String,int) in Library");
		System.out.println("closingTime is:"+closingTime+"size is:" +size); 
		
	}
	public void groupStudy(String name,char size,int openingTime,int closingTime)
	{
		System.out.println("invoking groupStudy with (String,char,int,int) in Library");
		System.out.println("name is:"+name+"size is:"+size+"closingTime is:+closingTime");

	}

}
