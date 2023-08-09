package com.xworkz.boot.accessspecifier;

import com.xworkz.app.City;
import com.xworkz.app.accessspecifier.GardenCity;

public class CityRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ZooRunner");
		City city=new City();
		city.street();
		city.street("Amirthizologicalpark");
		city.street(10);
		city.street(10,true);
		city.street(6,"delhi");
		city.street("Banglore","delhi",10,6);
		
		City gardenCity=new GardenCity();
		gardenCity.street();
		gardenCity.street("Mahatma Gandi Roadr");
		gardenCity.entertain(10);
		gardenCity.street(10,true);
		gardenCity.street(6,"delhi");
		gardenCity.street("Banglore","delhi",10,6);

	}


	}


