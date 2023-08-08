package com.xworkz.inheritancesuperchaining.boot;

import com.xworkz.inheritancesuperchaining.app.Gold;
import com.xworkz.inheritancesuperchaining.app.YelowGold;

public class GoldRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gold gold=new Gold("Aurum",true,2000,"high");
		this(gold.name);
		this(gold.isMetal);
		this(gold.price);
		this(gold.density);
		
		Gold yelowGold=new YelowGold();
		this(yelowGold.name);
		this(yelowGold.isMetal);
		this(yelowGold.price);
		this(yelowGold.density);
			
				

	}

}
