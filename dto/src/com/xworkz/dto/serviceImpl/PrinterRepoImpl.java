package com.xworkz.dto.serviceImpl;

import com.xworkz.dto.app.PrinterDTO;
import com.xworkz.dto.app.repositary.PrinterRepo;

public class PrinterRepoImpl  implements PrinterRepo{
	
	private PrinterRepo printerRepo;

	public void  PrinterServiceImpl(PrinterRepo printerRepo) {
		super();
		this.printerRepo = printerRepo;
	}
	
	

	@Override
	public boolean save(PrinterDTO dto) {
		// TODO Auto-generated method stub
		if (dto != null) {
			String brand = dto.getBrand();
			String size = dto.getSize();
			double costPerPaper = dto.getCostPerPaper();

			if (costPerPaper > 0) {
				System.out.println(dto.getCostPerPaper() + " is valid");
			} else {
				System.err.println("Cost is invalid");
				return false;
			}

			if (brand != null && !brand.isEmpty() && brand.length() > 2 && brand.length() <= 20 && size != null
					&& !size.isEmpty() && size.length() > 2 && size.length() <= 20) {
				System.out.println(dto.getBrand() + " is valid");
				System.out.println(dto.getSize() + " is valid");
			} else {
				System.err.println("Brand and size is not valid");
				return false;
			}

			this.printerRepo.save(dto);
			System.out.println("Printer is not null");
			System.out.println();
		}
		return false;
		
		
	}

}
