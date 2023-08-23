package com.xworkz.main;

import com.xworkz.boot.MetroRule;
import com.xworkz.interface23.Metro;

public class MetroRunner {

	public static void main(String[] args) {
    Metro metro=new MetroRule();
    metro.metroName("rajajinagar metro");
    metro.metroLineColor("blue");
    metro.aceptOnlinePayment(true, 35);
	}

}
