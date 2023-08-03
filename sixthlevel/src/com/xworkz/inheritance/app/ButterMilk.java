package com.xworkz.inheritance.app;
	public class ButterMilk extends Curd{
		
		public int quantity=100;
		
		public ButterMilk() {
			System.out.println("invoking no arg constructor in ButterMilk");
			System.out.println("Buttermilk quantity: "+quantity);

		}
		
		public void givesEnergy() {
			System.out.println("Invoking givesEnergy");
		}


}
