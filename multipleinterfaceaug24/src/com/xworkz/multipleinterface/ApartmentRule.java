package com.xworkz.multipleinterface;

public interface ApartmentRule extends PurchaseApartmentRule,BuildApartmentRule {
	public void construct();//by default access specifier will be public in interface

}
