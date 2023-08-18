package com.xworkz.cave;

public class CaveRunner {
		public static void main(String[] args) {
			System.out.println("Running main in CaveRunner");

			Cave cave=new Cave();
			System.out.println(cave);
			Cave cave1=new Cave("Ellora","Ellora",true,20.03,1500,true,"Calcite"," Aragonite",675,77);
			System.out.println(cave1);

			Cave cave2=new Cave("Badami","Calcite",true,23.03,1200,true,"Aragonite","Karnataka",234,542);
			System.out.println(cave2);

		}
	}


