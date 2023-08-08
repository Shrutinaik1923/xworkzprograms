package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.Mic;

public class MicRunner {

	public static void main(String[] args) 
	{
		System.out.println("Running main in MicRunner");
		Mic mic=new  Mic();
		mic.sound();
	
}

	}


