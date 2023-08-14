package com.xworkz.fourteen.app;

public abstract class Movie {
	public void sound()
	{
		System.out.println("invoking sound in Movie");
	}
	public boolean  watch()
	{
		System.out.println("invoking watch in Movie");
		return true;
	}
	public void visualArt()
	{
		System.out.println("invoking visualArt in Movie");
	}
	public void music()
	{
		System.out.println("invoking music in Movie");
	}
	public boolean suspense()
	{
		System.out.println("invoking suspense in Movie");
		return true;
	}
	public abstract boolean thriller();
	public abstract boolean enjoy();
	public abstract boolean spendTime();
	public abstract boolean expression();
	public abstract boolean inspiration();

}
