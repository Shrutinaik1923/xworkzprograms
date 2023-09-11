package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.DoctorDTO;

public interface DoctorRepo {
	int COUNT = 5;

	void saveDoctorInfo(DoctorDTO doctorDTO);

}
