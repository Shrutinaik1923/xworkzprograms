package com.xworkz.main;

import com.xworkz.boot.MilitaryRule;
import com.xworkz.interface23.MilitaryIntrerface;

public class MilitaryRunner {

	public static void main(String[] args) {
    System.out.println("invoking MilitaryRunner in main method");
    MilitaryIntrerface military=new MilitaryRule();
    military.security("Karnataka");
    military.isProvideProtection(true);
    military.noOfCommands(1028);
    
	}

}
