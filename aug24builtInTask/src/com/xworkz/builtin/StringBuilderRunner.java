package com.xworkz.builtin;

public class StringBuilderRunner {

	public static void main(String[] args) {
		StringBuilder build=new StringBuilder("Shruti Naik From Honnavar");

		//build="Shruti Naik From Honnavar";
		System.out.println(build);

		StringBuilder builder= build.deleteCharAt(0);
		System.out.println(builder);

		int a=build.indexOf("S");
		System.out.println("The index of character s is "+a);

		builder=build.reverse();
		System.out.println(builder);

		builder=build.reverse();
		System.out.println(builder);

		String name="auto";

		int i=build.lastIndexOf(name);
		System.out.println("The last index of name is "+i);


		builder=build.append(true);
		System.out.println(builder);



      
	}

}
