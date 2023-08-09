package com.xworkz.boot.accessspecifier;

import com.xworkz.app.accessspecifier.BlackBoxTheatre;
import com.xworkz.app.accessspecifier.Theatre;

public class TheatreRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in TheatreRunner");
		Theatre theatre=new Theatre();
		theatre.entertainment();
		
		Theatre theatre1=new Theatre();
		theatre1.entertainment("luluMall Banglore");
		
		Theatre theatre2=new Theatre();
		theatre2.entertainment(280);
		
		Theatre theatre3=new Theatre();
		theatre3.entertainment("Baby",4);
		
		Theatre theatre4=new Theatre();
		theatre4.entertainment(8,true);
		
		Theatre theatre5=new Theatre();
		theatre5.entertainment("lulumall banglore",'m',4,8);
		
		System.out.println("####################################");
		
		Theatre blackBoxTheatre=new BlackBoxTheatre();
		blackBoxTheatre.entertainment();
		
		Theatre blackBoxTheatre1=new BlackBoxTheatre();
		blackBoxTheatre1.entertainment("centralMall Banglore ");
		
		Theatre blackBoxTheatre2=new BlackBoxTheatre();
		blackBoxTheatre2.entertainment(380);
		
		Theatre blackBoxTheatre3=new BlackBoxTheatre();
		blackBoxTheatre3.entertainment("namoBhootatma",7);
		
		Theatre blackBoxTheatre4=new BlackBoxTheatre();
		blackBoxTheatre4.entertainment(10,true);
		
		Theatre blackBoxTheatre5=new BlackBoxTheatre();
		blackBoxTheatre5.entertainment("centralMall",'m',7,10);

	}

}
