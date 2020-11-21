package main;

import bo.MusicalInstrument;
import dao.MusicalInstrumentDAO;

public class Main {

	public static void main(String[] args) {
		
//		MusicalInstrument mu = new MusicalInstrument();
//
//		mu.setAge(8);
//		mu.setName("tenor Saxophone");
//		mu.setOwner("Felipe Alves");

//		// Insert Data
//		MusicalInstrumentDAO.insertMusicaInstrument(mu);
		
		// Select all data
		MusicalInstrumentDAO.selectAllMusicalInstrument();
	}

}
