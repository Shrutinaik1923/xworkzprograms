package com.xworkz.inheritance.app;


	public class Butter extends ButterMilk{
		
		public String brand="Nadini";
		
		public Butter() {
			System.out.println("invoking no arg construvtor in Butter");
			System.out.println("Butter brand"+brand);
		}
		
		public void taste() {
			System.out.println("Invoking taste");
		}

}
