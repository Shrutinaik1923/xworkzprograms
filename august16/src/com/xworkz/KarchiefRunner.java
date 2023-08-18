package com.xworkz;

public class KarchiefRunner {

	public static void main(String[] args) {

			System.out.println("invoking main in KercheifRunner");

			Karchief kercheif = new Karchief("Spin Cart", "Hand Kercheif", 100, "White", false, 20, false);
			System.out.println(kercheif);

			Karchief kercheif1 = new Karchief("Jockey", "Hand Kercheif", 200, "Blue", true, 10, true);
			System.out.println(kercheif1);

			Karchief kercheif2 = new Karchief("Allen Solley", "Face Kercheif", 50, "Chocolate", true, 30, true);
			System.out.println(kercheif2);

	}

}
