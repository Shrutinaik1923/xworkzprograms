package com.xworkz.crud.app.repository;

public interface TrainRepositary {

		int NO_OF_TRAINS = 5;

		void storeTrainNo(long trainNumber);

		default boolean isExists(long trainNumber) {
			return false;
		}
	}

