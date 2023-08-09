package com.xworkz.boot;

import com.xworkz.app.Temple;
import com.xworkz.app.accessspecifier.HinduTemple;

public class TempleRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in LibraryRunner");
		Temple temple=new Temple();
		temple.prayer();
		
		Temple temple1=new Temple();
		temple1.prayer("kashi temple");
		
		Temple temple2=new Temple();
		temple2.prayer(6);
		
		Temple temple3=new Temple();
		temple3.prayer(10,true);
		
		Temple temple4=new Temple();
		temple4.prayer(10,"kedharnath");
		
		Temple temple5=new Temple();
		temple5.prayer("Kashi","kedharnath",8,10);
		
		System.out.println("####################################");
		
		Temple hinduTemple=new HinduTemple();
		hinduTemple.prayer();
		
		Temple hinduTemple1=new HinduTemple();
		hinduTemple1.prayer("Murdeshwar");
		
		Temple hinduTemple2=new HinduTemple();
		hinduTemple2.prayer(6);
		
		Temple hinduTemple3=new HinduTemple();
		hinduTemple3.prayer(10,true);
		
		Temple hinduTemple4=new HinduTemple();
		hinduTemple4.prayer(10,"Honnavar");
		
		Temple hinduTemple5=new HinduTemple();
		hinduTemple5.prayer("Murdeshwara","Honnavar",7,10);

	}

	}


