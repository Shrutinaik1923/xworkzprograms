package com.xworkz.inheritance.sevenlevel.app;


	public class ElectricBus extends Car{
		public double price;
			
			public ElectricBus() {
				System.out.println("invoking no arg constructor in ElectricCar");
				System.out.println("ElectricCar price"+price);
			}
			
			public void charge() {
				System.out.println("invoking charge in ElectricCar");
			}


}
