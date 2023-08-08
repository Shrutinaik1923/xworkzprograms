package com.xworkz.inheritancesuperchaining.app;

public class PoisonousMushroom extends Mushroom {
	    
	       public PoisonousMushroom()
	       {   
	    	   this("brown",'s',200,true);
	    	   System.out.println("invoking with no argu constructor in PooisonousMushroom");
	       }
	       public PoisonousMushroom(String colour,char size,int price,boolean eidible)
	       {
	    	   super("brown",'s',200,true);
	    	   System.out.println("invoking with string,char,int,boolean argument in constructor in PoisonousMushroom ");
	       }

}
