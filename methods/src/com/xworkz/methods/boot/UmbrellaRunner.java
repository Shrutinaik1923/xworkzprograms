package com.xworkz.methods.boot;

import com.xworkz.methods.app.Umbrella;

public class UmbrellaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking Umbrella runner in main method");
		
		Umbrella umbrella=new Umbrella();
		umbrella.open();
		umbrella.open("Camel");
		umbrella.open(800);
		umbrella.open("StarBucks",500);
      }

}
