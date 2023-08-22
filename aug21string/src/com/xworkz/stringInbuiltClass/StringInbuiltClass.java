package com.xworkz.stringInbuiltClass;

public class StringInbuiltClass {

	public static void main(String[] args) {
		String name="Untouched Heaven";
	   System.out.println("value is:"+name);
	   System.out.println("value at 8:"+name.charAt(12));
	   
	    System.out.println("===============================");
	    int value=name.length();
	    System.out.println(value);
	    
	    String lstring= name.toLowerCase();
	    System.out.println(lstring);
	   
	    String ustring= name.toUpperCase();
	    System.out.println(ustring);
	    
	    String trimmedString= name.trim();
	    System.out.println(trimmedString);
	  
	    String nonTrimmedString="   Shruti   ";
	    System.out.println(nonTrimmedString);
	  
	    String trimmedString1=nonTrimmedString.trim();
	    System.out.println(trimmedString1);
	    
	    System.out.println(name.charAt(8)); 
	    System.out.println(name.indexOf(6));
	    System.out.println(name.substring(6));
	  
	 
	    System.out.println(name.substring(2,8));
	    
	    System.out.println(name.replace('h', 's' ));
	    System.out.println(name.startsWith("un"));
	    System.out.println(name.endsWith("ven"));
	    System.out.println(name.endsWith("over"));
	    
	    System.out.println(name.equals("Untouched Heaven"));
	    System.out.println(name.equals("untouched heaven"));
	    
	    System.out.println(name.equalsIgnoreCase("untouched heaven"));
	    System.out.println(name.isBlank());
	    
	    

	    
	   
	   


	   
	}

}


}
