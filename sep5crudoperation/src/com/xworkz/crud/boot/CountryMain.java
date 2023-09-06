package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.CountryRepository.CountryRepositary;
import com.xworkz.crud.app.repository.CountryServiceImpl;
import com.xworkz.crud.app.repository.service.CountryService;
import com.xworkz.crud.app.repository.service.CountryRepositaryImpl;


public class CountryMain {

		public static void main(String[] args) {
			CountryRepositary countryRepositary = new CountryRepositary();

			CountryService countryService = new CountryServiceImpl(countryRepositary);

			String[] count = { "India", "indonasia", "", null, "a", "India", "Japan" };

			for (int index = 0; index < count.length; index++) {
				countryService.countryStoreAndValidate(count[index]);
			}
		}
	}


