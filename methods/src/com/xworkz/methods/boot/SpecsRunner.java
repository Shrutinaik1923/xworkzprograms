package com.xworkz.methods.boot;

import com.xworkz.methods.app.Specs;

public class SpecsRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking SpecsRunner in main methods");
		Specs specs=new Specs();
		specs.transmitLight("concave");
		specs.transmitLight(200);
		specs.transmitLight("concave",100);	
	}

}
