package com.xworkz.dto.runner;

import com.xworkz.dto.app.WeatherDTO;
import com.xworkz.dto.app.repositary.WeatherRepositary;
import com.xworkz.dto.app.repositaryImpl.WeatherRepositaryImpl;
import com.xworkz.dto.service.WeatherService;
import com.xworkz.dto.serviceImpl.WeatherServiceImpl;

public class WeatherRunner {

	public static void main(String[] args) {
    System.out.println("invoking main in WeatherRunner");
    WeatherRepositary repo=new WeatherRepositaryImpl();
    WeatherService service= new WeatherServiceImpl(repo);
    WeatherDTO dto=new WeatherDTO();
    
    boolean Persisted=service.validateAndSave(dto);
	 System.out.println("Persisted"+Persisted);
	}

}
