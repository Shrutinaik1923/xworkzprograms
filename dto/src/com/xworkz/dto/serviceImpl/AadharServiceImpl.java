package com.xworkz.dto.serviceImpl;

import com.xworkz.dto.app.AadharDTO;
import com.xworkz.dto.app.repositary.AadharRepositary;
import com.xworkz.dto.service.AadharService;

public class AadharServiceImpl implements  AadharService{
	
	private AadharRepositary aadharRepositary;
	public  AadharServiceImpl(AadharRepositary aadharRepositary) {
		super();
		this.aadharRepositary = aadharRepositary;
	}

	@Override
	public boolean aadharValidate(AadharDTO aadharDTO) {
     if(aadharDTO!=null)
     {
    	 long number = aadharDTO.getNumber();
    	 String holderName = aadharDTO.getHolderName();
    	 String addrs = aadharDTO.getAddrs();
    	 
    	 if(number >=100000000000L && number <= 99999999999L)
    	 {
    		 System.out.println(aadharDTO.getNumber() + "is valid");
    	 }else {
    		 System.out.println("number is Invalid");
    	 return false;
    	}
    	 if(holderName != null && !holderName.isEmpty() && holderName.length() > 2 && holderName.length() <=20  && addrs!=null && !addrs.isEmpty() && addrs.length()>2 && addrs.length() <=30)
    	 {
    		 System.out.println(aadharDTO.getHolderName() + "is valid");
    		 
    		 System.out.println(aadharDTO.getAddrs() + "is valid");
    		 System.out.println("HolderName and address is not valid");
    		 

    	 }this.aadharRepositary.saveAadharInfo(aadharDTO);
    	 System.out.println("Aadhar is not null");
    	 
    	 }
		
		return false;
	}

}
