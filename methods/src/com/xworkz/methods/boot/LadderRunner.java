package com.xworkz.methods.boot;

import com.xworkz.methods.app.Ladder;

public class LadderRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking LadderRunner in main method");
		Ladder ladder=new Ladder();
		ladder.fold();
		ladder.fold("Attic ladder");
		ladder.fold(15.0d);
		ladder.fold("step ladder",20.0d);
	}

}
