package com.xworkz.boot;

import com.xworkz.app.accessspecifier.AquariumZoo;
import com.xworkz.app.accessspecifier.Zoo;

public class ZooRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ZooRunner");
		Zoo zoo=new Zoo();
		zoo.entertain();
		zoo.entertain("Amirthizologicalpark");
		zoo.entertain(10);
		zoo.entertain(10,true);
		zoo.entertain(6,"delhi");
		zoo.entertain("Banglore","delhi",10,6);
		
	    Zoo aquariumZoo=new AquariumZoo();
	    aquariumZoo.entertain();
	    aquariumZoo.entertain("Mahatma Gandi Roadr");
	    aquariumZoo.entertain(10);
	    aquariumZoo.entertain(10,true);
		aquariumZoo.entertain(6,"delhi");
		aquariumZoo.entertain("Banglore","delhi",10,6);

	}

}
