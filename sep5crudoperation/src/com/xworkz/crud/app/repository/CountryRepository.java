package com.xworkz.crud.app.repository;

public interface CountryRepository {
	public interface CountryRepositary {

		int TOTAL_COUNTRIES = 5;

		void storeCountry(String country);

		default boolean isExist(String country) {
			return false;
		}
	}

}
