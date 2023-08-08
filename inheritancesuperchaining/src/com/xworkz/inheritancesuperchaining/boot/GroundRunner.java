package com.xworkz.inheritancesuperchaining.boot;

import com.xworkz.inheritancesuperchaining.app.Ground;
import com.xworkz.inheritancesuperchaining.app.PlayGround;

public class GroundRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ground ground=new Ground("Tower PlayGround","Denmark",'m',"green");
		this(ground.name);
		this(ground.location);
		this(ground.size);
		this(ground.colour);
		
		System.out.println("******************************************");
		
		Ground playGround=new PlayGround();
		this(playGround.name);
		this(playGround.location);
		this(playGround.size);
		this(playGround.colour);
		

	}

}
