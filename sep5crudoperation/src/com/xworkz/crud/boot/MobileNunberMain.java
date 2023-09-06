package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.MobileRepositary;
import com.xworkz.crud.app.repository.MobileRepositaryImpl;
import com.xworkz.crud.app.repository.service.MobileService;
import com.xworkz.crud.app.repository.service.MobileServiceImpl;

public class MobileNunberMain {

		public static void main(String[] args) {
			MobileRepositary mobileRepositary = new MobileRepositaryImpl();

			MobileService mobileService = new MobileServiceImpl(mobileRepositary);

			long[] numbers = { 702259020, 815201070, 984448296, 0, 702259020 };

			for (long l : numbers) {
				mobileService.numberValidate(l);
			}
		}

}
