package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.Jacket;
import com.xworkz.crud.app.repository.JacketRepository;

public class JacketRunner {
	public static void main(String[] args) {

		Jacket jacketRepositary = new JacketRepository();

		System.out.println("Jackets are implementing in JacketRepositaryImpl");

		jacketRepositary.jackets("Jeans");
		jacketRepositary.jackets("Rain Jacket");
		jacketRepositary.jackets("White jacket");
		jacketRepositary.jackets("Stylish jacket");
		jacketRepositary.jackets("Cool Jacket");
		jacketRepositary.jackets("Jeans1");
		jacketRepositary.jackets("Jeans2");
		jacketRepositary.jackets("Jeans3");
		jacketRepositary.jackets("Jeans4");
		jacketRepositary.jackets("Jeans5");
		jacketRepositary.jackets("Jeans6");
	}


}
