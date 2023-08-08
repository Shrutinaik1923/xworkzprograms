package com.xworkz.iheritancecasting.showroom.boot;

import com.xworkz.iheritancecasting.showroom.app.MobileShowroom;
import com.xworkz.iheritancecasting.showroom.app.Showroom;
import com.xworkz.iheritancecasting.showroom.app.ShowroomUtil;
import com.xworkz.iheritancecasting.showroom.app.WatchShowroom;

public class ShowroomRunner {

	public static void main(String[] args) {

		Showroom showroom = new Showroom();
		MobileShowroom mobileShowroom = new MobileShowroom();
		WatchShowroom watchShowroom=new WatchShowroom();

		ShowroomUtil.run(showroom);
		ShowroomUtil.run(watchShowroom);
		ShowroomUtil.run(mobileShowroom);
	   
		

	}

}
