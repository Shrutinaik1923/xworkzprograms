package com.xworkz.builtin;

public class StringBufferRunner {

	public static void main(String[] args) {
         StringBuffer buf=  new StringBuffer();
         StringBuffer res=buf.append(false);
         System.out.println(res);
         
         res=buf.append(' ');
         System.out.println(res);
         
         res=buf.append('1');
         System.out.println(res);
         
         res=buf.append("shruti");
         System.out.println(res);
         
         res=buf.append(10.28);
 		 System.out.println(res);

 		 res=buf.append(' ');
 		 System.out.println(res);

 		 res=buf.append(120);
 		 System.out.println(res);
         
         

         
         
	}

}
