package com.xworkz.methods.boot;

import com.xworkz.methods.app.Piler;

public class PilerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking PilerRunner in main method");
		Piler piler=new Piler();
		piler.cut();
		piler.cut("Tata Agrico");
		piler.cut("yes");
		piler.cut("combination pilor",true);
	}

}
