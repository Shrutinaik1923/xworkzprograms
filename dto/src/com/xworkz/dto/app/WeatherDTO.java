package com.xworkz.dto.app;

import java.io.Serializable;

public class WeatherDTO implements Serializable {
	private String temprature;
	private boolean isClodiness;
	private double windSpeed;
	private boolean isPrecipitation;
	
	public WeatherDTO()
	{
		
	}
	
 
	public WeatherDTO(String temprature, boolean isClodiness, double windSpeed, boolean isPrecipitation) {
		super();
		this.temprature = temprature;
		this.isClodiness = isClodiness;
		this.windSpeed = windSpeed;
		this.isPrecipitation = isPrecipitation;
	}


	public String getTemprature() {
		return temprature;
	}


	public void setTemprature(String temprature) {
		this.temprature = temprature;
	}


	public boolean isClodiness() {
		return isClodiness;
	}


	public void setClodiness(boolean isClodiness) {
		this.isClodiness = isClodiness;
	}


	public double getWindSpeed() {
		return windSpeed;
	}


	public void setWindSpeed(double windSpeed) {
		this.windSpeed = windSpeed;
	}


	public boolean isPrecipitation() {
		return isPrecipitation;
	}


	public void setPrecipitation(boolean isPrecipitation) {
		this.isPrecipitation = isPrecipitation;
	}
	
	
}