package com.xworkz.boot;

import com.xworkz.app.accessspecifier.Hostel;
import com.xworkz.app.accessspecifier.StudentHostel;

public class HostelRunner {

	public static void main(String[] args) {
		System.out.println("Running main in HostelRunner");
		Hostel hotel=new Hostel ();
		hotel.security();
		
		Hostel hotel1=new Hostel();
		hotel1.security("SDM Hostel");
		
		Hostel hotel2=new  Hostel();
		hotel2.security(2000);
		
		Hostel hotel3=new  Hostel();
		hotel3.security("LuxuriousHostel");
		
		Hostel hotel4=new  Hostel();
		hotel4.security("LuxuriousHostel" ,100);
		
		Hostel hotel5=new  Hostel();
		hotel5.security("SDM Hostel" ,"LuxuriousHostel" ,800);
		
		System.out.println("##########################################");
		
		Hostel studentHostel=new  StudentHostel();
		studentHostel.security();
		
		Hostel studentHostel1=new  StudentHostel();
		studentHostel1.security("BCM Hostel");
		
		Hostel studentHostel2=new  StudentHostel();
		studentHostel2.security(50);
		
		Hostel studentHostel3=new  StudentHostel();
		studentHostel3.security("ActiveHostel");
		
		Hostel studentHostel4=new  StudentHostel();
		studentHostel4.security("ActiveHostel",80);
		
		Hostel studentHostel5=new  StudentHostel();
		studentHostel5.security("BCM Hostel ","ActiveHostel",80);

	}


	}


