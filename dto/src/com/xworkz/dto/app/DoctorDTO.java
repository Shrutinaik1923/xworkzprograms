package com.xworkz.dto.app;

import java.io.Serializable;

public class DoctorDTO implements Serializable {
	
	private String name;
	private String specialist;
	private int experience;
	private double consultancyCharge;
	
	public DoctorDTO()
	{
		
	}

	public DoctorDTO(String name, String specialist, int experience, double consultancyCharge) {
		super();
		this.name = name;
		this.specialist = specialist;
		this.experience = experience;
		this.consultancyCharge = consultancyCharge;
	}
	@Override
	public String toString() {
		return "DoctorDTO [name=" + name + ", specialist=" + specialist + ", experience=" + experience
				+ ", consultancyCharge=" + consultancyCharge + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getConsultancyCharge() {
		return consultancyCharge;
	}

	public void setConsultancyCharge(double consultancyCharge) {
		this.consultancyCharge = consultancyCharge;
	}
	
	
	

}
