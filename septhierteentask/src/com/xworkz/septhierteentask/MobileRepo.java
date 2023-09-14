package com.xworkz.septhierteentask;

public interface MobileRepo {
	public void save(MobileDTO dto);
	public boolean isExist(MobileDTO dto);
	public MobileDTO findByname(String name);
	public MobileDTO findBynameAndlocation(String name,String location);
	public MobileDTO findAll();
	


}
