package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.PincodeRepositary;
import com.xworkz.crud.app.repository.PincodeRepositaryImpl;
import com.xworkz.crud.app.repository.service.PincodeService;
import com.xworkz.crud.app.repository.service.PincodeServiceImpl;

public class PincodeMain {

		public static void main(String[] args) {
			PincodeRepositary pincodeRepositary = new PincodeRepositaryImpl();

			PincodeService pincodeService = new PincodeServiceImpl(pincodeRepositary);

			long[] pincodes = { 583219, 577004, 577002, 577001, 0, 583219 };

			for (long l : pincodes) {
				pincodeService.pincodeValidate(l);
			}
		}

}
