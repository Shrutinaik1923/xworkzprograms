package com.xworkz.inheritancesuperchaining.boot;

import com.xworkz.inheritancesuperchaining.app.Mushroom;
import com.xworkz.inheritancesuperchaining.app.PoisonousMushroom;


public class MushroomRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking constructor of mushroom in main method");
		
		Mushrooom mushroom=new Mushroom("white",'m',250,true);
		System.out.println(mushroom.colour);
		System.out.println(mushroom.size);
		System.out.println(mushroom.price);
		System.out.println(mushroom.eidible);
	    System.out.println("====================================");
		
		 
	    Mushrooom poisonousMushroom=new PoisonousMushroom();
	    
	    System.out.println(poisonousMushroom.colour);
	    System.out.println(poisonousMushroom.size);
	    System.out.println(poisonousMushroom.price);
	    System.out.println(poisonousMushroom.eidible);

	}

}
