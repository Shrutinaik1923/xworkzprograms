package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.BassDrum;
import com.xworkz.polymorhism.overriding.app.Drum;


public class DrumRunner {

	public static void main(String[] args) {
			System.out.println("Running main in MicRunner");
			Drum drum=new  BassDrum();
			drum.sound();
		
	}

}
