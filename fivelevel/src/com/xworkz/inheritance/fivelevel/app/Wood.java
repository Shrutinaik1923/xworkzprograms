package com.xworkz.inheritance.fivelevel.app;
	public class Wood extends Tree {
		public int noOfPieces=5;

		public Wood() {
			
				System.out.println("no arg costructor Wood");
			}
			public void burn()
			{
				System.out.println("Invoking burn in wood");
			}

}
