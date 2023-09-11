package com.xworkz.dto.runner;

import com.xworkz.dto.app.DoctorDTO;
import com.xworkz.dto.app.repositary.DoctorRepo;
import com.xworkz.dto.app.repositaryImpl.DoctorRepoImpl;
import com.xworkz.dto.service.DoctorService;
import com.xworkz.dto.serviceImpl.DoctorServiceImpl;

public class DoctorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoctorRepo doctorRepository = new DoctorRepoImpl();

		DoctorService doctorService = new DoctorServiceImpl(doctorRepo);

		DoctorDTO doctorDTO = new DoctorDTO("Shruti", "Heart", 3, 100);

		DoctorDTO doctorDTO2 = new DoctorDTO(null, null, 0, 0);

		DoctorDTO doctorDTO3 = new DoctorDTO("Shruu", "Eye", 0, 0);

		DoctorDTO doctorDTO4 = new DoctorDTO(null, null, 2, 200);

		DoctorDTO doctorDTO5 = new DoctorDTO("Rathod", "Head", 5, 200);

		doctorService.saveAndValidate(doctorDTO);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO2);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO3);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO4);
		System.out.println();

		doctorService.saveAndValidate(doctorDTO5);
	

	}

}
