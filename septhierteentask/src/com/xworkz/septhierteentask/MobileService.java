package com.xworkz.septhierteentask;

public interface MobileService {
	public boolean validateAndsave(MobileDTO dto);
	public boolean  findByName(String name);
	public boolean findBynameAndlocation(String name,String location);
	public boolean findAll();


}
