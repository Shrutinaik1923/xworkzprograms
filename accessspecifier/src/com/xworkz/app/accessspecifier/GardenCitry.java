package com.xworkz.app.accessspecifier;

import com.xworkz.app.City;

public class  GardenCity extends City {
	@Override
	public class street {
		public void transport()
		{
			System.out.println("invoking transport with no-arguements in Street");
		}
		public void street(String name)
		{
			System.out.println("invoking sell with(String) in Street");
			System.out.println("name is:"+name);
		}
		public void street(float distance)
		{
			System.out.println("invoking transport with (float) in Street");
			System.out.println("distance is:"+distance);
		}
		public void street(int width,boolean isGoodStreet)
		{
			System.out.println("invoking transport with(int,boolean) in Street");
			System.out.println("width is:"+width+ isGoodStreet +isGoodStreet);
			
		}
		public void street(int distance, String location)
		{
			System.out.println("invoking transport with (String,int) in Street");
			System.out.println("distance is:"+distance+"location is:" +location); 
			
		}
		public void street(String name,String location,int distance)
		{
			System.out.println("invoking transport with (String,char,int,int) in Street");
			System.out.println("name is:"+name+"location is:"+location+"distance is:"+distance);

		}
	}

}
