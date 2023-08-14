package com.xworkz.fourteen.boot;

import com.xworkz.fourteen.app.Highway;
import com.xworkz.fourteen.app.UrbanHighway;

public class HighwayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking highway runner in main method");
		Highway highway=new UrbanHighway();
		highway.connectivity();
		highway.interConnection();
		highway.economicGrowth();
		highway.publicService();
		highway.safety();
		highway.tourism();
		highway.trade();
		highway.transport();
		highway.travel();
		

	}

}
