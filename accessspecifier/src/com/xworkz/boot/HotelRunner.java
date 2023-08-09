package com.xworkz.boot;

import com.xworkz.app.Hotel;
import com.xworkz.app.accessspecifier.TajHotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Running main in HotelRunner");
		Hotel hotel=new  Hotel();
		hotel.prepareFood();
		
		Hotel hotel1=new Hotel();
		hotel1.prepareFood("Udupi");
		
		Hotel hotel2=new  Hotel();
		hotel2.prepareFood(200);
		
		Hotel hotel3=new  Hotel();
		hotel3.prepareFood("veg");
		
		Hotel hotel4=new  Hotel();
		hotel4.prepareFood("veg" ,100);
		
		Hotel hotel5=new  Hotel();
		hotel5.prepareFood("udupi" ,"veg" ,100);
		
		Hotel tajHotel=new  TajHotel();
		tajHotel.prepareFood();
		
		Hotel tajHotel1=new  TajHotel();
		tajHotel1.prepareFood("Kamath restaurant");
		
		Hotel tajHotel2=new  TajHotel();
		tajHotel2.prepareFood(50);
		
		Hotel tajHotel3=new  TajHotel();
		tajHotel3.prepareFood("vegiterian");
		
		Hotel tajHotel4=new  TajHotel();
		tajHotel4.prepareFood("vegiterian",80);
		
		Hotel tajHotel5=new  TajHotel();
		tajHotel5.prepareFood("kamath restaurant","vegiterian",280);


	}

}
