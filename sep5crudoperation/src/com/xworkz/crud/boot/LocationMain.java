package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.LocationRepositaryImpl;
import com.xworkz.crud.app.repository.LocationRepository.LocationRepositary;
import com.xworkz.crud.app.repository.service.LocationService;
import com.xworkz.crud.app.repository.service.LocationServiceImpl;

public class LocationMain {

		public static void main(String[] args) {
			LocationRepositary locationRepositary = new LocationRepositaryImpl();
			LocationService locationService = new LocationServiceImpl(locationRepositary);

//			String[] loc = { "Hampi", "Hospete", null, "", "a" };
//			for (int index = 0; index < loc.length; index++) {
//				locationService.storeAndValidate(loc[index]);
//			}

			locationService.storeAndValidate("Davanagere");

			locationService.storeAndValidate(null);

			locationService.storeAndValidate("a");

			locationService.storeAndValidate("");

			locationService.storeAndValidate("Davanagere");

			locationService.storeAndValidate("Hampi");

			locationService.storeAndValidate("Hampi");
		}
	}


