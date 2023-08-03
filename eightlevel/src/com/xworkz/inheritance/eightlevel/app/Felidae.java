package com.xworkz.inheritance.eightlevel.app;


	public class Felidae extends Carnivore{
		public String familyName="Mammal";
		public Felidae() {
			System.out.println("Invoking no arg constructor in Felidae");
			
		}
		
		public void eatFood() {
			System.out.println("Invoking eatFood in Felidae");
		}

}
