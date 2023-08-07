package com.xworkz.methods.app;

public class Umbrella {
	
		public String brand;
		public int price;
		 public void open()
		 {
			 System.out.println("invoking Umbrella with no arguements");
			 open("Rylan");
			 open(100);	 
		 }
		 public void open(String brand)
		 {
			 System.out.println("invoking Umbrella with String");
			 System.out.println("brand is:"+brand);
		 }
		 public void open(int price)
		 {
			 System.out.println("invoking Umbrella with int");
			 System.out.println("price is:"+price);
		 }
		 public void open(String name,int price)
		 {
			 System.out.println("invoking String,int in open");
			 System.out.println("brand is :" +brand+ "price is:"+price);
		 }

	}



