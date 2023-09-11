package com.xworkz.dto.serviceImpl;

import com.xworkz.dto.app.PrinterDTO;
import com.xworkz.dto.app.repositary.PrinterRepo;
import com.xworkz.dto.service.PrinterService;

public class Printer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		PrinterRepo printerRepo = new PrinterRepoImpl();

		PrinterService printerService = new PrinterServiceImpl(printerRepo);

		PrinterDTO dto = new PrinterDTO("Hp", "Medium", 3);

		PrinterDTO dto2 = new PrinterDTO("Lenovo", "Small", 0);

		PrinterDTO dto3 = new PrinterDTO(null, null, 5);

		PrinterDTO dto4 = new PrinterDTO(null, null, 0);

		PrinterDTO dto5 = new PrinterDTO("Asus", "Large", 6);

		printerService.saveAndValidate(dto);

		printerService.saveAndValidate(dto2);

		printerService.saveAndValidate(dto3);

		printerService.saveAndValidate(dto4);

		printerService.saveAndValidate(dto5);

	}
		
	}


