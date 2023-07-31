package com.xworkz.assignment1.app;

public class Player {
	public String name;
	public int exp;
	public Buiding buiding;
	public HomeTown town;
	
	public Player(String name,int exp,Buiding buiding,HomeTown town)
	{
		this.name=name;
		this.exp=exp;
		this.buiding=buiding;
		this.town=town;
	}
	public void printInfo()
	{
		System.out.println("invoking printinfo in player");
		System.out.println("Player name :"+name);
		System.out.println("Player exp:"+exp);
		System.out.println("###########################");
		buiding.printInfo();
		System.out.println("****************************");
		town.printInfo();
		
	}

}
