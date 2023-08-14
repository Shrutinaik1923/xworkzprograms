package com.xworkz.fourteen.app;
public abstract class Bank{
	public void open()
	{
		System.out.println("invoking open in bank");
	}
	public void close()
	{
		System.out.println("invoking close in bank");
	}
	public boolean depositMoney()
	{
		System.out.println("invoking depositMoney in bank");
		return true;
	}
	public boolean withdraw()
	{
		System.out.println("invoking withdraw in bank");
		return true;
	}
	public boolean loan() {
		System.out.println("invoking loan in bank");
		return true;
	}
	public abstract boolean credit();
	public abstract boolean  transfer();
	public abstract boolean safety();
	public abstract boolean  discount();
	public abstract boolean agency();
	
	

}
