package com.xworkz.methods.app;

public class Hotel{
	public String grade ;
	public int numberOfEmployees;
	public String location;
	
	public void provideFood()
	{
		System.out.println("invoking provideFood with no-arguements");
		provideFood("4.5 star");
		provideFood(10);
		provideFood("Manglore");
	}
	public void provideFood(String grade)
	{
		System.out.println("invoking provideFood with String");
		System.out.println("grade is :+grade");
	}
	public void provideFood(int noOfEmployees)
	{
		System.out.println("invoking provideFood with int");
		System.out.println("noOfEmployees is :"+noOfEmployees);
	}
	public void provideFood(int noOfEmployees,String location)
	{
		System.out.println("invoking provideFood with int and String");
		System.out.println("noOfEmployees is :"+noOfEmployees+" String loacation is:"+location);
	}
}
