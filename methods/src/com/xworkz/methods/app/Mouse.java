package com.xworkz.methods.app;

public class Mouse {
	public String type;
    public 	int price;
    public void move()
    {
     System.out.println("invoking no-arguementsi in mouse");
     move("Mechanical mice");
     move(300);
    }
    public void move(String type)
    {
    	System.out.println("invoking String in mouse");
    	System.out.println("type is:"+type);
    }
    public void move(int price)
    {
    	System.out.println("invoking int price in Mouse");
    	System.out.println("price is:"+price);
    }
    public void move(String type,int price)
    {
    	System.out.println("invoking (String,int)in mouse");
    	System.out.println("type is:"+type+"price is:"+price);
    }
	
	

}
