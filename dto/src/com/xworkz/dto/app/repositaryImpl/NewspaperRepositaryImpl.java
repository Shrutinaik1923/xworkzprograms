package com.xworkz.dto.app.repositaryImpl;

import com.xworkz.dto.app.NewspaperDTO;
import com.xworkz.dto.app.repositary.NewspaperRepositary;

public class NewspaperRepositaryImpl implements NewspaperRepositary {
	
	private  NewspaperDTO[] dtos = new NewspaperDTO[TOTAL_ITEMS];
	private int position;
	
	
@Override
public void save(NewspaperDTO dto) {

	if (this.position < TOTAL_ITEMS) {
		this.dtos[position] = dto;
		System.out.println(this.dtos[position] + " is at index " + position);
		this.position++;
	} else {
		System.err.println("Location position out of bound");
	}

}


}

