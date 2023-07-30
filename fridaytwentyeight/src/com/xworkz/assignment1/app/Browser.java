package com.xworkz.assignment1.app;

public class Browser {
	Internet internet=new Internet();
	
	public void search()
	{
		System.out.println("browser is chrome");
		if(this.internet!=null)
		{
			this.internet.InternetSpeed();
			this.internet.InternetConnectionType();
		}
		else
		{
			System.out.println("NullPointerException");
			
		}
	}

}
