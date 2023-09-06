package com.xworkz.crud.app.repository.service;

import com.xworkz.crud.app.repository.PincodeRepositary;

public class PincodeServiceImpl implements PincodeService {

		private PincodeRepositary pincodeRepositary;

		public PincodeServiceImpl(PincodeRepositary pincodeRepositary) {
			super();
			this.pincodeRepositary = pincodeRepositary;
		}

		@Override
		public boolean pincodeValidate(long pincode) {
			if (pincode != 0 && pincode > 100000 && pincode <= 999999) {
				if (!this.pincodeRepositary.isExist(pincode)) {
					this.pincodeRepositary.pincodeStore(pincode);
					return true;
				} else {
					System.err.println("Pincode already exists..");
				}
			} else {
				System.err.println("Pincode is in-valid");
			}
			return false;
		}


}
