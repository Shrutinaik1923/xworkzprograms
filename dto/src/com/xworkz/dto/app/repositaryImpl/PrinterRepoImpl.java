package com.xworkz.dto.app.repositaryImpl;

import com.xworkz.dto.app.PrinterDTO;
import com.xworkz.dto.app.repositary.PrinterRepo;

public class PrinterRepoImpl implements  PrinterRepo{

	
	private PrinterDTO[] dtos = new PrinterDTO[TOTAL_SIZE];
	private int position; 
	
	
	@Override
	public void save(PrinterDTO dto) {
		// TODO Auto-generated method stub
		
		if (this.position < TOTAL_SIZE) {
			this.dtos[position] = dto;
			System.out.println(dto + " is at position " + position);

			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBoundException");
		}

		
	}

	
}
