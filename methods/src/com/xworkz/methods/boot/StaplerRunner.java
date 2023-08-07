package com.xworkz.methods.boot;

import com.xworkz.methods.app.Stapler;

public class StaplerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking stapler in main method");
		Stapler stapler=new Stapler();
		stapler.joiningPapers();
		stapler.joiningPapers("rapesco");
		stapler.joiningPapers(10);
		stapler.joiningPapers("Stanely",10);
	}

}
