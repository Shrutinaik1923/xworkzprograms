package com.xworkz.methods.boot;

import com.xworkz.methods.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println("invoking HotelRunner in main method");
         
         Hotel hotel=new Hotel();
         hotel.provideFood();
         hotel.provideFood("3.5 star");
         hotel.provideFood(12);
         hotel.provideFood("karnataka");
         hotel.provideFood(15,"madras");
         
	}

}
