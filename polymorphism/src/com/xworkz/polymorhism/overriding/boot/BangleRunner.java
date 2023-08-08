package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.Bangle;
import com.xworkz.polymorhism.overriding.app.GoldBangle;

public class BangleRunner {

	public static void main(String[] args) {
		System.out.println("Running main in BangleRunner");
		Bangle bangle=new GoldBangle();
		bangle.sound();
	}

}
