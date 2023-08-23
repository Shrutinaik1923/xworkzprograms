package com.xworkz.main;

import com.xworkz.boot.PgRule;
import com.xworkz.interface23.PgInterface;

public class PgRunner {

	public static void main(String[] args) {
    PgInterface pg=new PgRule();
    pg.accommondation("SJR LADIES PG");
    pg.payRent(6000);
    pg.providesecurity(true);
	}

}
