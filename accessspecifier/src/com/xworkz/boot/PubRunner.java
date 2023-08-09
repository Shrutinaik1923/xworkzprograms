package com.xworkz.boot;

import com.xworkz.app.accessspecifier.Pub;
import com.xworkz.app.accessspecifier.ThemePubs;

public class PubRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in ZooRunner");
		Pub pub=new Pub();
		pub.meet();
		pub.meet("Amirthizologicalpark");
		pub.meet(10);
		pub.meet(10,true);
		pub.meet(6,"delhi");
		pub.meet("Banglore","delhi");
		
		Pub themePubs=new ThemePubs();
		themePubs.meet();
		themePubs.meet("Mahatma Gandi Roadr");
		themePubs.meet(10);
		themePubs.meet(10,true);
		themePubs.meet(6,"delhi");
		themePubs.meet("Banglore",10,6);

	}


	}


