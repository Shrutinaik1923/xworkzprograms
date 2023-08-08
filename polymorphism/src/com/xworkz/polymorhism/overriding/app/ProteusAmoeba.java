package com.xworkz.polymorhism.overriding.app;

public class ProteusAmoeba extends Amoeba
    {
	
      @Override
      public void move()
  	{
  		System.out.println("invoking move with amoeba");
  	}

}
