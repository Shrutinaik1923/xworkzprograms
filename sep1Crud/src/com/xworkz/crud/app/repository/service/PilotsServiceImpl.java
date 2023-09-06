package com.xworkz.crud.app.repository;

public class PilotRepository implements Pilot {
	private String[] pilotArray = new String[NO_OF_PILOTS];
	int position;

	@Override
	public void pilot(String pilot) {
		if (this.position < NO_OF_PILOTS) {
			this.pilotArray[position] = pilot;
			System.out.println(pilotArray[position] + " is at index " + position);
			this.position++;
		} else 
		{
			System.out.println("ArrayIndexOutOfBoundException");
		}

	}
}
