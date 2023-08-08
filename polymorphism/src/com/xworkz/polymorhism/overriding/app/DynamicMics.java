package com.xworkz.polymorhism.overriding.app;

public class DynamicMics extends Mic {
	@Override
	public void sound()
	{
		System.out.println("invoking sound with DynamicMics");
	}


}
