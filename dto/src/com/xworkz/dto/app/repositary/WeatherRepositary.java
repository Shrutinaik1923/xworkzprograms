package com.xworkz.dto.app.repositary;

import com.xworkz.dto.app.WeatherDTO;

public interface WeatherRepositary {
	int TOTAL_NO_OF_WEATHERDATA=5;
	void store(WeatherDTO dto);
	

}
