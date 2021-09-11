package com.StirngHandling;

public class LengthMethod {
	
	public static void main(String args[]) {
		
		String string1="Hi all welcome to core java";
		String stringArray[]=string1.split(" ");
		
		//For accessing the string array
		for(int i=0;i<stringArray.length;i++) {
			
			System.out.println(stringArray[i]);			
		}
	}
	
}
