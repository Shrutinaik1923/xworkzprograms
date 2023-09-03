package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.Pilot;
import com.xworkz.crud.app.repository.PilotRepository;

public class PilotRunner {
	public static void main(String[] args) {
		Pilot pilotRepositary = new PilotRepository();

		System.out.println("Pilot is implementing in PilotRepositaryImpl");

		pilotRepositary.pilot("Santhu");
		pilotRepositary.pilot("Sateesh");
		pilotRepositary.pilot("Sampath");
		pilotRepositary.pilot("Prashanth");
		pilotRepositary.pilot("Praveen");
		pilotRepositary.pilot("Abhinandan");
		pilotRepositary.pilot("Shreya");
		pilotRepositary.pilot("Santosh");
		pilotRepositary.pilot("Kumar");
		pilotRepositary.pilot("Harish");

		pilotRepositary.pilot("Manjunath");
	}

}
