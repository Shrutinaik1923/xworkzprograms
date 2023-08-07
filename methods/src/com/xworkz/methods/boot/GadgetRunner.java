package com.xworkz.methods.boot;

import com.xworkz.methods.app.Gadget;

public class GadgetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking Gadgets in main method");
		
		Gadget gadget=new Gadget();
		gadget.computing();
		gadget.computing("realme watch");
		gadget.computing(2000);
		gadget.computing("realme watch",2000);

		

	}

}
