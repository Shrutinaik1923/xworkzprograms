package com.xworkz.multipleinterface;

public class PrestigeApartmentRule implements ApartmentRule {
	@Override
	public void construct() {
    System.out.println("invoking construct()in PrestigeApartmentRule");		
	}

}
