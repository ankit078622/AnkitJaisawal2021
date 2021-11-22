/*
-> Java String class endsWith() method checks if this string ends with a given suffix. 
-> It returns true if this string ends with the given suffix;  else returns false.
-> The endsWith() method raises the NullPointerException if one passes null in the 
   parameter of the method. 
 */
package com.StirngHandling;

public class EndsWithMethod {
	
	public static void main(String args[]) {
		
		String s1="Welcome to tutorialpoint";
		System.out.println(s1.endsWith("point"));
		
		System.out.println(s1.endsWith("to"));
		
		boolean isEndWith=s1.endsWith("to tutorialpoint");
		System.out.println(isEndWith);
		
		//It will give error 
		try {
			
			System.out.println(s1.endsWith(null));
		}
		catch(NullPointerException e) {
			System.out.println("Technical issue "+e);
			
		}
		
		
	}

}
