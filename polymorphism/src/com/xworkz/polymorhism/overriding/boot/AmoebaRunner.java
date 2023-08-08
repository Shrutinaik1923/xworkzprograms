package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.Amoeba;
import com.xworkz.polymorhism.overriding.app.ProteusAmoeba;

public class AmoebaRunner {
	public static void main(String[] args)
	{
		System.out.println("Running main in AmoebaRunner");
		Amoeba.amoeba=new ProteusAmoeba();
		amoeba.move();
	}


}
