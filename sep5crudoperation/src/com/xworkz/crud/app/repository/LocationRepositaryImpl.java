package com.xworkz.crud.app.repository;

import com.xworkz.crud.app.repository.LocationRepository.LocationRepositary;

public class LocationRepositaryImpl implements LocationRepositary {

		private String[] locations = new String[NO_OF_LOCATIONS];

		int position;

		@Override
		public void storeLocation(String location) {
			if (this.position < NO_OF_LOCATIONS) {
				this.locations[position] = location;
				System.out.println(this.locations[position] + " is at index " + position);
				this.position++;
			} else {
				System.err.println("Location position out of bound");
			}

		}

		@Override
		public boolean isExist(String location) {
			for (int index = 0; index <= this.position; index++) {
				String temp = locations[index];
				if (temp != null && temp.equals(location)) {
					return true;
				}

			}
			return LocationRepositary.super.isExist(location);
		}

	}


