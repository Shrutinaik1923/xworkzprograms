package com.xworkz.dto.runner;

import com.xworkz.dto.app.NewspaperDTO;
import com.xworkz.dto.app.repositary.NewspaperRepositary;
import com.xworkz.dto.app.repositaryImpl.NewspaperRepositaryImpl;
import com.xworkz.dto.service.NewspaperService;
import com.xworkz.dto.serviceImpl.NewspaperServiceImpl;

public class NewspaperRunner {

	public static void main(String[] args) {
		
	 NewspaperRepositary repo=new NewspaperRepositaryImpl();
	 NewspaperService service=new  	 NewspaperServiceImpl(repo);
	 NewspaperDTO dto=new NewspaperDTO();
	 boolean Persisted=service.validateAndSave(dto);
	 System.out.println("Persisted"+Persisted);
	}

}
