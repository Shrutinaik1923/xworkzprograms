package com.xworkz.inheritance.app;

	public class Curd extends Milk{
		
		public int price=50;
		
		public Curd() {
			System.out.println("invoking no arg construvtor in Cow");
			System.out.println("Curd price"+price);

		}
		
		public void makeButterMilk() {
			System.out.println("invoking makeButterMilk");
		}

}
