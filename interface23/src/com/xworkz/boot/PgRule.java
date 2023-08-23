package com.xworkz.boot;

import com.xworkz.interface23.PgInterface;

public class PgRule implements PgInterface {

	@Override
	public void accommondation(String pgName) {
    System.out.println("invoking accommondation in pginterface");
	}

	@Override
	public int payRent(int rent) {
    System.out.println("invoking rent in pgInterface");
		return rent;
	}

	@Override
	public boolean providesecurity(boolean security) {
    System.out.println("invoking security in pgInterface");
		return true;
	}

}
