package com.xworkz.dto.serviceImpl;

import com.xworkz.dto.app.WeatherDTO;
import com.xworkz.dto.app.repositary.WeatherRepositary;
import com.xworkz.dto.service.WeatherService;

public class WeatherServiceImpl implements WeatherService {
	private WeatherRepositary weatherRepositary;
	private int position;
	
	public WeatherServiceImpl(WeatherRepositary weatherRepositary)
	{
		this.weatherRepositary=weatherRepositary;
		
	}	
	
@Override
public boolean validateAndSave(WeatherDTO dto) {
    System.out.println("invoking validate and save"+this.getClass().getName());
    if(dto!=null)
	{
		System.out.println("weather data is valid"+this.position);
		String temprature=dto.getTemprature();
		boolean isClodiness=dto.isClodiness();
		double windSpeed=dto.getWindSpeed();
		boolean isPrecipitation=dto.isPrecipitation();
	}

	if(temprature!=null && !temprature.isEmpty() && temprature.length>=3 && temprature.length()<=20);
	{
		System.out.println("data is valid");
	}
	this.weatherRepositary.store(dto);
	return false;
  }
 else
{
  System.out.println("data is invalid cannot save");
}
  return false;
}

}