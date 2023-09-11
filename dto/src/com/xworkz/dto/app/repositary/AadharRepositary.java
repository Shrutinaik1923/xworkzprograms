package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.AadharDTO;

public interface AadharRepositary {
	int NUMBER = 5;
	
	void saveAadharInfo(AadharDTO aadharDTO);

}
