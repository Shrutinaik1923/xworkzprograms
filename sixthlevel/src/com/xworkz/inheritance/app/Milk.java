package com.xworkz.inheritance.app;
	public class Milk extends Cow{
		
		public String type="Toned Milk";
		
		public Milk() {
			System.out.println("invoking no arg construvtor in Milk");
			System.out.println("Milk type:"+type);
		}
		
		public void giveProtien() {
			System.out.println("Invoking giveProtien in Cow");
		}

}
