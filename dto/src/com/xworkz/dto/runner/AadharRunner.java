package com.xworkz.dto.runner;

import com.xworkz.dto.app.AadharDTO;
import com.xworkz.dto.app.repositary.AadharRepositary;
import com.xworkz.dto.app.repositaryImpl.AadharRepositaryImpl;
import com.xworkz.dto.service.AadharService;

public class AadharRunner {
	public static void main(String[] args) {
		AadharRepositary aadharRepository = new AadharRepositaryImpl();

		AadharService aadharService = new AadharServiceImpl(aadharRepositary);

		AadharDTO aadharDTO = new AadharDTO(744116519748L, "Santosh", "Hadagali");

		AadharDTO aadharDTO2 = new AadharDTO(278176267837L, "Rathid", "Hospete");

		AadharDTO aadharDTO3 = new AadharDTO(0, "Sameer", "Hansi");

		AadharDTO aadharDTO4 = new AadharDTO(172387456372L, null, null);

		AadharDTO aadharDTO5 = new AadharDTO(0, null, null);

		aadharService.aadharValidate(aadharDTO);

		aadharService.aadharValidate(aadharDTO2);

		aadharService.aadharValidate(aadharDTO3);

		aadharService.aadharValidate(aadharDTO4);

		aadharService.aadharValidate(aadharDTO5);
	
	}

}
