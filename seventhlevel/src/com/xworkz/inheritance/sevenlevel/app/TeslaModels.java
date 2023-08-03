package com.xworkz.inheritance.sevenlevel.app;

	public class TeslaModels extends ElectricBus{
		
		public double costInCrore=20.8;
		
		public TeslaModels() {
			System.out.println("invoking no arg constructor in TeslaModel");
			System.out.println("TeslaModel price"+costInCrore);
		}
		
		public void activateSpoiler() {
			System.out.println("invoking activateSpoiler in TeslaModel");
		}

}
