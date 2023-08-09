package com.xworkz.boot;

import com.xworkz.app.accessspecifier.CentralPoliceStation;
import com.xworkz.app.accessspecifier.PoliceStation;


public class PoliceStationRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in PoliceStationRunner");
		PoliceStation policeStation=new PoliceStation();
		policeStation.investigation();
		policeStation.investigation("ballari jail");
		policeStation.investigation(10);
		policeStation.investigation(10,9.0l);
		policeStation.investigation(6,"delhi");
		policeStation.investigation("Banglore","delhi");
		
		PoliceStation centralPoliceStation=new CentralPoliceStation();
		centralPoliceStation.investigation();
		centralPoliceStation.investigation("Mahatma Gandi Roadr");
		centralPoliceStation.investigation(10);
		centralPoliceStation.investigation(10,8.0l);
		centralPoliceStation.investigation(6,"delhi");
		centralPoliceStation.investigation("Ballari Jail",10);

	}
	}


