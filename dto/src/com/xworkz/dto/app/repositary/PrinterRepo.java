package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.PrinterDTO;

public interface PrinterRepo {
	int TOTAL_SIZE = 5;

	void save(PrinterDTO dto);
}


