package com.xworkz.fourteen.boot;

import com.xworkz.fourteen.app.Metro;
import com.xworkz.fourteen.app.RajajiNagarMetro;

public class MetroRunner {

	public static void main(String[] args) {
		Metro metro=new RajajiNagarMetro();
		metro.connectivity();
		metro.isProvideTravel();
		metro.isQuickReach();
		metro.isTraficless();
		metro.lessTime();
		metro.stop();
		metro.moving();
		metro.secure();
		metro.reduceNoOfVehicle();
	
	}

}
