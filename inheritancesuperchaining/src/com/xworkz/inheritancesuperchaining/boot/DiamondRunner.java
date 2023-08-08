
package com.xworkz.inheritancesuperchaining.boot;

import com.xworkz.inheritancesuperchaining.app.Diamond;
import com.xworkz.inheritancesuperchaining.app.NaturalDiamond;

public class DiamondRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diamond diamond=new Diamond("green",800,true,"Synthetic");
		System.out.println(diamond.colour);
		System.out.println(diamond.price);
		System.out.println(diamond.refraction);
		System.out.println(diamond.type);
		
		System.out.println("###############################");
		
		Diamond naturalDiamond=new NaturalDiamond();
		System.out.println(naturalDiamond.colour);
        System.out.println(naturalDiamond.price);
		System.out.println(naturalDiamond.refraction);
		System.out.println(naturalDiamond.type);
		

	}

}
