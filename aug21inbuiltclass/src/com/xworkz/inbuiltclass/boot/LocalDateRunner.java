package com.xworkz.inbuiltclass.boot;

public class LocalDateRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        ExampleString exampleString = new ExampleString("Hello, Java!");
		        exampleString.printValue();
		        System.out.println("Length: " + exampleString.length());
		        System.out.println("Concatenated: " + exampleString.concat(" Welcome"));
		        System.out.println("Is Empty: " + exampleString.isEmpty());
		        System.out.println("Character at index 7: " + exampleString.charAt(7));
		        System.out.println("Compare result: " + ExampleString.compare("Apple", "Banana"));


	}

}
