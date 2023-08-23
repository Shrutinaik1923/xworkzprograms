package com.xworkz.boot;

import com.xworkz.interface23.MilitaryIntrerface;

public class MilitaryRule implements MilitaryIntrerface {

	@Override
	public void security(String location) {
    System.out.println("invoking security in MilitaryRule");
	}

	@Override
	public int noOfCommands(int no) {
    System.out.println("invoking commands in MilitaryRule");
		return 18;
	}

	@Override
	public boolean isProvideProtection(boolean protection) {
    System.out.println("invoking protection in MilitaryRule");
		return true;
	}

}
