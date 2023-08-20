package com.xworkz.equal.main;

import com.xworkz.equal.Ceo;

public class CeoRunner {

	

		public static void main(String[] args) {
			System.out.println("invoking main in CEORunner");
			Ceo ceo = new Ceo("Culture", "Openness", "Organizing", 50, 100000, 7);
			System.out.println(ceo);
			Ceo ceo2 = new Ceo("People", "Extraversion", "Staffing", 52, 10000, 5);
			System.out.println(ceo2);
			System.out.println("****************************************");
			boolean same = ceo.equals(ceo2);
			System.out.println("Contents are same:" + same);


		}

}

