package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.BigGate;
import com.xworkz.polymorhism.overriding.app.Gate;

public class GateRunner {

	public static void main(String[] args) {
		
			System.out.println("Running main in GateRunner");
			Gate gate=new BigGate();
			gate.open();
		

	}

}
