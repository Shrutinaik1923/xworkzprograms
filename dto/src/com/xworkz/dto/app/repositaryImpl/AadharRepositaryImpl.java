package com.xworkz.dto.app.repositaryImpl;

import com.xworkz.dto.app.AadharDTO;
import com.xworkz.dto.app.repositary.AadharRepositary;

public class AadharRepositaryImpl implements AadharRepositary{
	
	private AadharDTO[] dtos = new AadharDTO[NUMBER];
	private int position;
	
	@Override
	public void saveAadharInfo(AadharDTO aadharDTO) {
       if(this.position < NUMBER)	{
    	   this.dtos[position] = aadharDTO;
    	   System.out.println(aadharDTO + "is at index " +position);
    	   this.position++;
       }else {
    	   System.out.println("ArrayIndexOutBoundException");
       }
	}
	
	
}
