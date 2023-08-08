package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.Ticket;
import com.xworkz.polymorhism.overriding.app.VipTicket;

public class TicketRunner {

	public static void main(String[] args) {
		System.out.println("Running main in TicketRunner");
		Ticket ticket=new  VipTicket();
		ticket.track();
}

	}


