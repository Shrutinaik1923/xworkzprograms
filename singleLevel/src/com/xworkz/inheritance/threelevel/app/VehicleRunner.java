package com.xworkz.inheritance.threelevel.app;

public class VehicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoking main in VehicleRunner");
		Vehicle vehicle=new Vehicle();
		System.out.println(vehicle.use);
		vehicle.run();
		System.out.println("==========================");
		 Car car=new Car();
		 car.drive();
		 System.out.println(car.use);
		 System.out.println(car.type);
		 car.run();
		 System.out.println("==================");
		 Vehicle car1=new Car();
		 System.out.println(car1.use);
		 car1.run();
		 
          
		 
		 
		

	}

}
