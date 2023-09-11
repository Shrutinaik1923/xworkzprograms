package com.xworkz.dto.serviceImpl;

import com.xworkz.dto.app.NewspaperDTO;
import com.xworkz.dto.app.repositary.NewspaperRepositary;
import com.xworkz.dto.service.NewspaperService;

public class NewspaperServiceImpl implements  NewspaperService{
	
	private NewspaperRepositary newspaperRepositary;
	private int position;
	
	public NewspaperServiceImpl(NewspaperRepositary newspaperRepositary)
	{
	 this.newspaperRepositary = newspaperRepositary;
	}		 
	@Override
	public boolean validateAndSave(NewspaperDTO dto) {
			System.out.println("invoking validate and save"+this.getClass().getName());
			if(dto!=null)
			{
				System.out.println("newspaper data is valid"+this.position);
				String name=dto.getName();
				Double cost=dto.getCost();
				String publisher=dto.getPublisher();
				String language=dto.getLang();
			}
			
			if(name!=null&&!name.isEmpty()&& name.length>=3&&name.length()<=20);
			{
				System.out.println("name is valid");
			}
			this.newspaperRepositary.save(dto);
			return false;
	}
	else
	{
		System.out.println("data is invalid cannot save");
	}
    return false;
}
}