package com.xworkz.inheritance.fivelevel.app;

public class PlantKiller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plant plant=new Plant();
		plant.grow();
		System.out.println(plant.name);
		System.out.println("=================");
		Tree plant1=new Tree();
		plant1.grow();
		System.out.println(plant1.name);
		plant1.cut();
		System.out.println(plant1.type);
		System.out.println("=================");
		Wood plant2=new Wood();
		plant2.grow();
		System.out.println(plant2.name);
		plant2.cut();
		System.out.println(plant2.type);
		System.out.println(plant2.noOfPieces);
		plant2.burn();
		System.out.println("=================");
		Cupboard plant3=new Cupboard();
		plant3.grow();
		System.out.println(plant.name);
		tree3.cut();
		System.out.println(wood.type);
		System.out.println(wood.noOfPieces);
		wood3.burn();
		System.out.println(plant3.door);
		plant3.open();
		System.out.println("=================");
		Door plant4=new Door();
		plant.grow();
		System.out.println(plant4.name);
		tree.cut();
		System.out.println(plant4.type);
		System.out.println(plant4.noOfPieces);
		wood.burn();
		System.out.println(plant4.door);
		plant4.open();
		plant4.close();
		System.out.println(plant4.size);
		System.out.println("=================");
		Window plant5=new Window();
		plant5.grow();
		System.out.println(plant5.name);
		plant5.cut();
		System.out.println(plant5.type);
		System.out.println(plant5.noOfPieces);
		plant5.burn();
		System.out.println(plant5.door);
		plant5.open();
		plant5.close();
		System.out.println(plant5.size);
		plant5.swipe();
		System.out.println(plant5.length);
		
	}

	}


