package com.xworkz.main;

import com.xworkz.boot.EngineerRule;
import com.xworkz.interface23.EngineerInterface;

public class EngineerMain {

	public static void main(String[] args) {
    EngineerInterface engineer=new EngineerRule();
    engineer.attiendance(true);
    engineer.classTime(9);
    engineer.engineeringBranch("CSE");
    
	}

}
