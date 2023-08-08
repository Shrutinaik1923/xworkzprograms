package com.xworkz.iheritancecasting.chocolate.boot;

import com.xworkz.iheritancecasting.chocolate.app.CaramelChocolate;
import com.xworkz.iheritancecasting.chocolate.app.Chocolate;
import com.xworkz.iheritancecasting.chocolate.app.ChocolateUtil;
import com.xworkz.iheritancecasting.chocolate.app.DarkChocolate;

public class ChocolateRunner {

	public static void main(String[] args) {
    
		
		System.out.println("Invoking main in  ChocolateRunner ");
		
		Chocolate chocolate=new Chocolate();
		DarkChocolate darkChocolate=new DarkChocolate();
		CaramelChocolate caramelChocolate=new CaramelChocolate();
		
		ChocolateUtil.run(caramelChocolate);
		ChocolateUtil.run(darkChocolate);

	}

}
