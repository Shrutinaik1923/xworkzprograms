package com.xworkz.inheritancesuperchaining.boot;

import com.xworkz.inheritancesuperchaining.app.Router;
import com.xworkz.inheritancesuperchaining.app.Wifi;

public class RouterRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking constructor of router in routerRunner");
		
		Router router=new Router("NetGear","wireless","true"250);
		
		System.out.println(router.name);
		System.out.println(router.type);
		System.out.println(router.provideTraffic);
		System.out.println(router.price);
		
		System.out.println("######################################");
		
		Wifi wifi=new Wifi();
		
		System.out.println(wifi.name);
		System.out.println(wifi.type);
		System.out.println(wifi.provideTraffic);
		System.out.println(wifi.price);



	}

}
