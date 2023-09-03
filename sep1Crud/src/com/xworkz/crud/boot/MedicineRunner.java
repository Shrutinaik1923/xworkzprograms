package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.Medicine;
import com.xworkz.crud.app.repository.MedicineRepository;

public class MedicineRunner {
	public static void main(String[] args) {

		Medicine medicineRepositary = new MedicineRepository();

		System.out.println("Medicene is implementing in MedicineRepositaryImpl");

		medicineRepositary.medicenes("Dolo");
		medicineRepositary.medicenes("Vicks");
		medicineRepositary.medicenes("Anacine");
		medicineRepositary.medicenes("Paracetamel");
		medicineRepositary.medicenes("Syrup");
		medicineRepositary.medicenes("caughSyrup");
		medicineRepositary.medicenes("Tincher");
		medicineRepositary.medicenes("Bandage");
		medicineRepositary.medicenes("Powder");
		medicineRepositary.medicenes("Drops");
		medicineRepositary.medicenes("Aintment");

	}

}
