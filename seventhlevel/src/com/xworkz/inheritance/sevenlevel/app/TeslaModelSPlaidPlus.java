package com.xworkz.inheritance.sevenlevel.app;
	public class TeslaModelSPlaidPlus extends  TeslaModelSPlaid{
	    public int year=2018;
		
		
		public TeslaModelSPlaidPlus() {
			System.out.println("Invoking no arg constructor in TeslaModelSPlaidPlus");
			System.out.println("TeslaModelSPlaidPlus year"+year);
		}
		
		public void leatherInterior() {
			System.out.println("Invoking leatherInterior in TeslaModelSPlaidPlus");
		}


}
