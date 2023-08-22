package com.xworkz.inbuiltclass.boot;

import com.xworkz.inbuiltclass.app.ExampleInteger;

public class IntegerMain {
	public static void main(String[] args) {
        ExampleInteger exampleInteger = new ExampleInteger(42);
        exampleInteger.printValue();
        System.out.println("Is Even: " + exampleInteger.isEven());
        System.out.println("Is Positive: " + exampleInteger.isPositive());
        System.out.println("Sum: " + ExampleInteger.sum(10, 20));	
	}

}
