package com.xworkz.assignment1.app;

public class Sport {
	public String name;
	public Player[] players;
	
	public Sport(String name,Player[] players)
	{
		this.name=name;
		this.players=players;
	}
	public void printInfo() 
	{
		System.out.println("invoking printInfo in Sport");
		System.out.println("name is:"+name);
		for(int i=0;i<this.players.length;i++)
		{
			Player ref=this.players[i];
			ref.printInfo();
		}
	}
	

}
