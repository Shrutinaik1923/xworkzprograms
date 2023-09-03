package com.xworkz.crud.app.repository;

public class HistoricalPlacesRepository implements HistoricalPlaces {
	private String[] placesArray = new String[NO_OF_PLACES];
	private int position;

	@Override
	public void places(String place) {
		if (this.position < NO_OF_PLACES) {
			this.placesArray[position] = place;
			System.out.println(placesArray[position] + " is at index " + position);
			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBOundException");
		}

	}

		
}
