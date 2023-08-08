package com.xworkz.polymorhism.overriding.app;

public class BassDrum extends Drum{
	@Override
	public void sound()
	{
		System.out.println("invoking sound with Drum");
	}


}
