package com.xworkz.crud.app.repository;

	public interface PincodeRepositary {

		int TOTAL_NO_OF_CODES = 5;

		void pincodeStore(long code);

		default boolean isExist(long code) {
			return false;
		}

}
