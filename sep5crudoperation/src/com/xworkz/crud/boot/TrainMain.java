package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.TrainRepositary;
import com.xworkz.crud.app.repository.service.TrainService;
import com.xworkz.crud.app.repository.service.TrainserviceImpl;

public class TrainMain {

		public static void main(String[] args) {
			TrainRepositary noRepositary = new TrainRepositaryImpl();

			TrainService noservice = new TrainserviceImpl(noRepositary);

			long[] numbers = { 12080, 17392, 16590, 0, 16590 };

			for (long l : numbers) {
				noservice.trainNoValidate(l);
			}
		}

}
