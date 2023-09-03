package com.xworkz.crud.boot;

import com.xworkz.crud.app.repository.GroceriesRepository;
import com.xworkz.crud.app.repository.Grocery;

public class GroceryRunner {

	public static void main(String[] args) {
	System.out.println("invoking main in GroceryRunner");
      Grocery repo=new GroceriesRepository();
      repo.save("fruits");
      repo.save("rice");
      repo.save("barli");
      repo.save("daal");
      repo.save("chocolates");
      repo.save("salt");
      repo.save("cumine seeds");
      repo.save("buiscits");
      repo.save("milk");
      repo.save("drinks");
      repo.save("rice");





      
      
	}

}
