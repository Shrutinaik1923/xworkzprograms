package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.BestCoal;
import com.xworkz.polymorhism.overriding.app.Coal;

public class CoalRunner {

	public static void main(String[] args) {
		System.out.println("Running main in coalRunner");
		Coal.coal=new BestCoal();
		coal.burn();
	}

}
