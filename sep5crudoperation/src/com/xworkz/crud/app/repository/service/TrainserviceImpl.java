package com.xworkz.crud.app.repository.service;

import com.xworkz.crud.app.repository.TrainRepositary;

public class TrainserviceImpl implements TrainService {

		private TrainRepositary trainNoRepositary;
		private TrainRepositary trainRepositary;

		public void TrainServiceImpl(TrainRepositary trainRepositary) {
			super();
			this.trainRepositary = trainRepositary;
		}

		@Override
		public boolean trainNoValidate(long trainNumber) {
			if (trainNumber != 0 && trainNumber > 10000 && trainNumber < 99999) {
				if (!this.trainNoRepositary.isExists(trainNumber)) {
					this.trainNoRepositary.storeTrainNo(trainNumber);
					return true;
				} else {
					System.err.println("Train number already exists..");
				}
			} else {
				System.err.println("Train number is in-valid");
			}
			return false;
		}

}
