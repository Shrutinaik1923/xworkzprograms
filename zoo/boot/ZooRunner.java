package com.xworkz.iheritancecasting.zoo.boot;

import com.xworkz.iheritancecasting.zoo.app.NationalZoo;
import com.xworkz.iheritancecasting.zoo.app.StateZoo;
import com.xworkz.iheritancecasting.zoo.app.Zoo;
import com.xworkz.iheritancecasting.zoo.app.ZooUtil;

public class ZooRunner {

	public static void main(String[] args) {
     System.out.println("Running main in ZooRunner");
		
		Zoo zoo=new Zoo();
		NationalZoo nationalZoo=new NationalZoo();
		StateZoo stateZoo=new StateZoo();
		
		ZooUtil.run(stateZoo);
		ZooUtil.run(nationalZoo);
		
	}


	}


