package com.xworkz.crud.app.repository;

public class ArtistRepository implements Artist{

	private String[] artist = new String[NO_OF_ARTIST];

	private int position = 0;

	@Override
	public void artists(String artists) {

		if (this.position < NO_OF_ARTIST) {
			this.artist[position] = artists;
			System.out.println(artist[position] + " is at index " + position);
			this.position++;
		} else {
			System.err.println("ArrayIndexOutOfBOundException");
		}

	}

	
		
	

}
