package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.Artist;
import com.xworkz.crud.app.repository.ArtistRepository;

public class ArtistRunner {

		public static void main(String[] args) {
			Artist artistRepositary = new ArtistRepository();

			System.out.println("Artists are implementing in ArtistRepositaryImpl");

			artistRepositary.artists("Musician");
			artistRepositary.artists("Dancer");
			artistRepositary.artists("Scketcher");
			artistRepositary.artists("Folk Singer");
			artistRepositary.artists("Drawing");
			artistRepositary.artists("Clasical Singer");
			artistRepositary.artists("Rap Singer");
			artistRepositary.artists("Baratha Natya Dancer");
			artistRepositary.artists("Fluet Singer");
			artistRepositary.artists("DJ Artist");

			artistRepositary.artists("Swimmer");

		}

}
