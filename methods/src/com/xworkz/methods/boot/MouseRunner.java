package com.xworkz.methods.boot;

import com.xworkz.methods.app.Mouse;

public class MouseRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoking MouseRunner in main method");
		Mouse mouse=new Mouse();
		mouse.move();
		mouse.move("tectile mice");
		mouse.move(280);
		mouse.move("optical mice",380);
	}

}
