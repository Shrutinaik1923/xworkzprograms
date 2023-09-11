package com.xworkz.dto.app.repositaryImpl;

import com.xworkz.dto.app.WeatherDTO;
import com.xworkz.dto.app.repositary.WeatherRepositary;

public class WeatherRepositaryImpl implements WeatherRepositary{
	
	private WeatherDTO[] dtos = new  WeatherDTO[TOTAL_NO_OF_WEATHERDATA];
	private int position;
	
	@Override
	public void store(WeatherDTO dto) {
       if(this.position < TOTAL_NO_OF_WEATHERDATA)	
       {
    	   this.dtos[position]=dto;
    	   System.out.println("this.dtos[position]"+"is at index" +position);
    	   this.position++;
       }else
       {
    	   System.out.println("weather is out of bound");
       }
	}

}
