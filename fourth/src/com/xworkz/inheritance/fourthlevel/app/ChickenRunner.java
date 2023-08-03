package com.xworkz.inheritance.fourthlevel.app;

public class ChickenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken chicken=new Chicken();
		chicken.run();
		System.out.println(chicken.type);
		System.out.println("==========================");
		Meat meat=new Meat();
		meat.cut();
		meat.run();
		System.out.println(meat.kg);
		System.out.println(meat.type);
		System.out.println("==========================");
		Gravy gravy=new Gravy();
		System.out.println(gravy.good);
		gravy.cut();
		gravy.run();
		gravy.spicy();
		System.out.println(gravy.type);
		System.out.println(gravy.kg);
		System.out.println("==========================");
		Biryani biryani=new Biryani();
		meat.cut();
		chicken.run();
		gravy.spicy();
		biryani.tasty();
		System.out.println(gravy.good);
		System.out.println(meat.kg);
		System.out.println(biryani.noOfPlates);
		System.out.println(chicken.type);
		System.out.println("==========================");
		TikkaBiryani biryani1=new TikkaBiryani();
		meat.cut();
		chicken.run();
		gravy.spicy();
		biryani1.tasty();
		biryani1.eating();
		System.out.println(gravy.good);
		System.out.println(meat.kg);
		System.out.println(biryani.noOfPlates);
		System.out.println(chicken.type);
		System.out.println(biryani1.recipe);
				
	}




	}


