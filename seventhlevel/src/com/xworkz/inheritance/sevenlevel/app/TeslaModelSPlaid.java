package com.xworkz.inheritance.sevenlevel.app;
	public class TeslaModelSPlaid extends  TeslaModelSLongRange{
		public String model;
			
			
			public TeslaModelSPlaid() {
				System.out.println("Invoking no arg constructor in TeslaModelSPlaid");
				System.out.println("TeslaModelSPlaid model"+model);
			}
			
			public void batteryCapacity() {
				System.out.println("Invoking batteryCapacity in TeslaModelSPlaid");
			}

}
