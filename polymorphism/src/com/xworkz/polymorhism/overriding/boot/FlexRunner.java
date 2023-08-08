package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.Flex;
import com.xworkz.polymorhism.overriding.app.RollingFlex;

public class FlexRunner {

	public static void main(String[] args) {
		
			System.out.println("Running main in FlexRunner");
			Flex flex=new  RollingFlex();
			flex.eat();
		
	}

}
 