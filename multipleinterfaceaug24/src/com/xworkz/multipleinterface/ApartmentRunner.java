package com.xworkz.multipleinterface;

public class ApartmentRunner {
	public static void main(String[] args) {
		System.out.println("invoking ApartmentRule in main method");
		
		ApartmentRule apartment=new PrestigeApartmentRule();
		apartment.construct();
		PurchaseApartmentRule apartment1=new PrestigeApartmentRule();
		apartment1.construct();
		BuildApartmentRule apartment2=new PrestigeApartmentRule();
		apartment2.construct();
		CommonApartmentRule apartment3=new PrestigeApartmentRule();
		apartment3.construct();


		


		
		
	}

}
