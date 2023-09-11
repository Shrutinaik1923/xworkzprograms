package com.xworkz.dto.service;

import com.xworkz.dto.app.WeatherDTO;

public interface WeatherService {
    boolean validateAndSave(WeatherDTO dto);
}
