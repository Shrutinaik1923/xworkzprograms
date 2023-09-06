package com.xworkz.crud.app.repository;

	public interface MobileRepositary {

		int NO_OF_MOBILES = 5;

		void storeMobileNo(long number);

		default boolean isExisis(long number) {
			return false;
		}
	}


