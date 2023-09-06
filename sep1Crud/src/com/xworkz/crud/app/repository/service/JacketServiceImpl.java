package com.xworkz.crud.app.repository;

public class JacketRepository implements Jacket {

		private String[] jacketArray = new String[JACKETS];
		private int position;

		@Override
		public void jackets(String jacket) {
			if (this.position < JACKETS) {
				this.jacketArray[position] = jacket;
				System.out.println(jacketArray[position] + " is at index " + position);
				this.position++;
			}else {
				System.err.println("ArrayIndexOutOfBOundException");
			}
		}

}
