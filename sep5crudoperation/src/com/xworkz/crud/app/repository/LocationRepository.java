package com.xworkz.crud.app.repository;

public interface LocationRepository {
	public interface LocationRepositary {

		int NO_OF_LOCATIONS = 5;

		void storeLocation(String location);

		default boolean isExist(String location) {
			return false;
		}
	}
}
