package com.xworkz.polymorhism.overriding.boot;

import com.xworkz.polymorhism.overriding.app.BlackboxTheatre;
import com.xworkz.polymorhism.overriding.app.Theatre;


public class TheatreRunner {

		public static void main(String[] args) {
			System.out.println("Running main in TheatreRunner");
			Theatre theatre=new  BlackboxTheatre();
			theatre.noise();
	}

}
