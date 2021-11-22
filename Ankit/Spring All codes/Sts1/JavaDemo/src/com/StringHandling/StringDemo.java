package com.StringHandling;

public class StringDemo {

	public static void main(String arga[]) {
		
		String name="Ram Kumar";
		System.out.println("Length of string is: "+name.length());
		
		String uppercasedemo="RAM KUMAR";
		System.out.println("String result in lowercase : "+uppercasedemo.toLowerCase());
		
		String lowercasedemo="ram kumar";
		System.out.println("String result in Uppercase : "+lowercasedemo.toUpperCase());
		
		char ast=lowercasedemo.charAt(5);
		System.out.println("Position of char : "+ast);
		
		lowercasedemo.toString();
	}
}
