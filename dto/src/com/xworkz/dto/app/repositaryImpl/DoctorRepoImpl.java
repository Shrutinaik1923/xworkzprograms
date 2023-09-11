package com.xworkz.dto.app.repositaryImpl;

import com.xworkz.dto.app.DoctorDTO;
import com.xworkz.dto.app.repositary.DoctorRepo;

public class DoctorRepoImpl implements  DoctorRepo{
	
	private DoctorDTO[] dtos = new DoctorDTO[COUNT];
	private int position;

	

	@Override
	public void saveDoctorInfo(DoctorDTO doctorDTO) {
		// TODO Auto-generated method stub
		

		if (this.position < COUNT) {
			this.dtos[position] = doctorDTO;
			System.out.println(doctorDTO + " is at position " + position);

			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBoundException");
		}

	}

	@Override
	public void saveDoctorInfo(DoctorDTO doctorDTO) {
		// TODO Auto-generated method stub
		
	}

}
