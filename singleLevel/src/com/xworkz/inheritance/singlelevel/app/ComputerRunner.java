package com.xworkz.inheritance.singlelevel.app;

public class ComputerRunner {

	public static void main(String[] args) {
		System.out.println("Runnig main in ComputerRunner");
		//Computer computer=new Computer();
		Laptop laptop=new Laptop();
		laptop.turnOn();
		laptop.shutDown();

	}

}
