package com.xworkz.polymorhism.overriding.app;

public class BlackboxTheatre extends Theatre{
	@Override
	public void noise()
	{
		System.out.println("invoking noise with Theatre");
	}


}
