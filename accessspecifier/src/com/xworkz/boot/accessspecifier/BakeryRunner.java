package com.xworkz.boot.accessspecifier;

import com.xworkz.app.accessspecifier.Bakery;
import com.xworkz.app.accessspecifier.BreadBakery;

public class BakeryRunner {

	public static void main(String[] args) {
		System.out.println("Running main in BakeryRunner");
		Bakery bakery=new  Bakery();
		bakery.prepareFood();
		
		Bakery bakery1=new Bakery();
		bakery1.prepareFood("ayyangar");
		
		Bakery bakery2=new  Bakery();
		bakery2.prepareFood(200);
		
		Bakery bakery3=new  Bakery();
		bakery3.prepareFood("veg");
		
		Bakery bakery4=new  Bakery();
		bakery4.prepareFood("veg" ,100);
		
		Bakery bakery5=new  Bakery();
		bakery5.prepareFood("ayyangar" ,"veg" ,100);
		
		System.out.println("##########################################");
		
		Bakery breadBakery=new  BreadBakery();
		breadBakery.prepareFood();
		
		Bakery breadBakery1=new  BreadBakery();
		breadBakery1.prepareFood("mahalakshmi breadBakery");
		
		Bakery breadBakery2=new  BreadBakery();
		breadBakery2.prepareFood(50);
		
		Bakery breadBakery3=new  BreadBakery();
		breadBakery3.prepareFood("RyeBread");
		
		Bakery breadBakery4=new  BreadBakery();
		breadBakery4.prepareFood("RyeBread",80);
		
		Bakery breadBakery5=new  BreadBakery();
		breadBakery5.prepareFood("mahalakshmi breadBakery","RyeBread",80);

	}

}
