package com.xworkz.boot;

import com.xworkz.interface23.EngineerInterface;

public class EngineerRule implements EngineerInterface {

	@Override
	public void engineeringBranch(String name) {
    System.out.println("invoking branch in engineeringRule");
	}

	@Override
	public int classTime(int time) {
    System.out.println("invoking time in engineeringRule");
		return time;
	}

	@Override
	public boolean attiendance(boolean present) {
    System.out.println("invoking attiedance in engineeringRule");
		return true;
	}

}
