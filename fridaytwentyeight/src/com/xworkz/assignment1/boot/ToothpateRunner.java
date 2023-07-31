package com.xworkz.assignment1.boot;

import com.xworkz.assignment1.app.Company;
import com.xworkz.assignment1.app.Ingridient;
import com.xworkz.assignment1.app.Toothpaste;

public class ToothpateRunner {
	public static void main(String[] args)
	{
		System.out.println("invoking main in ToothpasteRunner");
		String name="colgate";
		String brand="colgate";
		Company company=new Company("colgate","raj","america");
		Ingridient ingridient=new Ingridient("glyserin",9,16);
		Ingridient ingridient1=new Ingridient("water",8,20);
		Ingridient ingridient2=new Ingridient("salt",7,30);
		Ingridient ingridient3=new Ingridient("neem",6,18);
		Ingridient ingridient4=new Ingridient("clove",15,28);
		Ingridient[] ingridients= {ingridient,ingridient1,ingridient2,ingridient3,ingridient4};

		Toothpaste toothpaste=new Toothpaste(name,brand,company,ingridients);
		
		toothpaste.printInfo();
		
	}
	

}
