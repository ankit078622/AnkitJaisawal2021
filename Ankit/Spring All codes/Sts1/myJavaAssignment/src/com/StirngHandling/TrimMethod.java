/*
-> Java String class trim() method eliminates leading and trailing spaces.
-> The Unicode value of space character is '\u0020'. The trim() method in Java string checks this
   Unicode value before and after the string, if it exists then the method removes the spaces and 
   returns the omitted string.
 */
package com.StirngHandling;

public class TrimMethod {
	
	public static void main(String args[]) {
		
		String s=" Hi how are you    ";
		//trim()method demo
		System.out.println("Before trim method : "+s+"\nLenght : "+s.length());// without trim() method
			
		s=s.trim();
		System.out.println("After trim method : "+s+"\nLenght : "+s.length());//after use of with trim() method
		
	}

}
