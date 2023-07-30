package com.xworkz.assignment1.app;

public class Shop {
	Salesman salesman=new Salesman();
	public void salesMan()
	{
			System.out.println("Shop has salesman");
			this.salesman.salesmanName();
			if(salesman!=null)
			{
				System.out.println("salesman points to memory");
			}
			else
			{
				System.out.println("NullPointerException");
			}
	
	}

}
