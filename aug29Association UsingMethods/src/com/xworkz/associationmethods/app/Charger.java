package com.xworkz.associationmethods.app;

public class Charger {
	public void type()
	{
		System.out.println("invoking type() in Charger");
		length();
	}

	public void length()
	{
		System.out.println("invoking length() in Charger");
		input();
	}

	public void input()
	{
		System.out.println("invoking input() in Charger");
		output();
	}

	public void output()
	{
		System.out.println("invoking output() in Charger");
	}


}
