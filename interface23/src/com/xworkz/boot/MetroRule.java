package com.xworkz.boot;

import com.xworkz.interface23.Metro;

public class MetroRule implements Metro {

	@Override
	public void metroName(String name) {
    System.out.println("invoking metroName in MetroRule");
	}

	@Override
	public String metroLineColor(String color) {
		System.out.println("invoking metroLineColor in MetroRule");
		return color;
	}

	@Override
	public boolean aceptOnlinePayment(boolean payment, int pricePerHead) {
		System.out.println("invoking aceptOnlinePayment in MetroRule");
		return true;
	}

}
