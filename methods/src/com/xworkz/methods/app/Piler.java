package com.xworkz.methods.app;

public class Piler {
	public String brand;
	public boolean isCrimpingMetal;
	public void cut()
	{
		System.out.println("invoking no-arguements in cut");
		cut("Tata Agrico");
		cut("yes");
	}
	public void cut(String brand)
	{
		System.out.println("invoking String in piler");
		System.out.println("brand is:"+brand);
	}
	public void cut(boolean isCrimpingMetal)
	{
		System.out.println("invoking boolean in piler");
		System.out.println("isCrimpingMetal :"+isCrimpingMetal);
	}
	public void cut(String brand,boolean isCrimpingMetal)
	{
		System.out.println("invoking(String,boolean)in Piler");
		System.out.println("brand is:"+brand+"isCrimpingMetal is:"+isCrimpingMetal);
	}
}
