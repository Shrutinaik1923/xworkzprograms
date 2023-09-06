package com.xworkz.crud.app.repository.service;

import com.xworkz.crud.app.repository.LocationRepository.LocationRepositary;

public class LocationServiceImpl implements LocationService {

		LocationRepositary locationRepositary;

		public LocationServiceImpl(LocationRepositary locationRepositary) {
			super();
			this.locationRepositary = locationRepositary;
		}

		@Override
		public boolean storeAndValidate(String location) {
			if (location != null && !location.isEmpty() && location.length() > 2 && location.length() <= 20) {
				if (!locationRepositary.isExist(location)) {
					this.locationRepositary.storeLocation(location);
					System.out.println("Location is valid");
					return true;
				} else {
					System.err.println("Location is already exists...");
				}

			} else {
				System.err.println("Can't stored..");
			}
			return false;

		}


}
