package com.xworkz.boot;

import com.xworkz.interface23.TempleInterface;

public class TempleRule implements TempleInterface {

	@Override
	public void worship(String templeName) {
    System.out.println("invoking worship in templerule");
	}

	@Override
	public boolean providePeice(boolean peice) {
    System.out.println("invoking peice in templerule");
		return true;
	}

	@Override
	public int noOfRounds(int noOfRounds) {
    System.out.println("invoking rounds in templeRule ");
		return noOfRounds;
	}

}
