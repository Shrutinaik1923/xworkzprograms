package com.xworkz.polymorhism.overriding.app;

public class VipTicket extends Ticket{
	@Override
	public void track()
	{
		System.out.println("invoking track with Ticket");
	}

}
