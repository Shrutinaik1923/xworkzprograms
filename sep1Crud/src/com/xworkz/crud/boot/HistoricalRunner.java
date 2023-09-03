package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.HistoricalPlaces;
import com.xworkz.crud.app.repository.HistoricalPlacesRepository;

public class HistoricalRunner {
	public static void main(String[] args) {

		HistoricalPlaces historicalPlacesRepositary = new HistoricalPlacesRepository();

		System.out.println("Places implementing in Historical Implementing");

		historicalPlacesRepositary.places("Hampi");
		historicalPlacesRepositary.places("Beluru");
		historicalPlacesRepositary.places("Halebidu");
		historicalPlacesRepositary.places("Mysore");
		historicalPlacesRepositary.places("Hasan");
		historicalPlacesRepositary.places("Golgumbug");
		historicalPlacesRepositary.places("Taj Mahal");
		historicalPlacesRepositary.places("Kerala");
		historicalPlacesRepositary.places("Moodbidre");
		historicalPlacesRepositary.places("Kalasa");

		historicalPlacesRepositary.places("KedarNath");

	}

}
