package com.xworkz.inheritance.eightlevel.app;


	public class Carnivore extends Mamamml {
		public String name="Lion";
			
			public Carnivore() {
				System.out.println("Invoking no arg constructor in Carnivore");
				System.out.println("Carnivore name:"+name);
			}
			
			public void eatMeats() {
				System.out.println("Invoking eatMeats in Carnivore");
			}


}
