package com.xworkz.main;

import com.xworkz.boot.TempleRule;
import com.xworkz.interface23.TempleInterface;

public class TempleRunner {

	public static void main(String[] args) {
    System.out.println("invoking templeRunner in main method");
    TempleInterface temple=new TempleRule();
    temple.worship("MAHADEV");
    temple.noOfRounds(7);
    temple.providePeice(true);
    
	}

}
