package com.xworkz.inheritance.app;
	public class Ghee extends Butter{
		
		public int cost=350;
		
		public Ghee() {
			System.out.println("invoking no arg construvtor in Ghee");
			System.out.println("Ghee cost"+cost);
		}
		
		public void makeSweet() {
			System.out.println("Invoking makesSweet");
		}

}
