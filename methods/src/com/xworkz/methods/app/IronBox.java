package com.xworkz.methods.app;

	public class IronBox {
		public String brand;
		public double price;
		
		public void iron()
		{
			System.out.println("invoking iron with no arguements");
			iron("philips");
			iron(800.0d);
		}
		public void iron(String brand)
		{
			System.out.println("invoking iron with String in IronBox");
			System.out.println("brand is :" +brand);
		}
		public void iron(double price)
		{
			System.out.println("invoking iron with String in IronBox");
			System.out.println("price is :" +price);
		}
		public void iron(String brand,double price)
		{
			System.out.println("invoking iron with(String,String)in in IronBox");
			iron(brand);
			iron(price);
			
		}
		

	}



