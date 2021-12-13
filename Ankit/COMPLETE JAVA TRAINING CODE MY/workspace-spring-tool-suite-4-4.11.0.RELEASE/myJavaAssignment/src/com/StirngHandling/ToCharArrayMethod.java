package com.StirngHandling;

public class ToCharArrayMethod {
	
	public static void main(String args[]) {
		
		String s="Java Programming";
		char charArray[]=s.toCharArray();
		
		//Printing the char array element
		for(int i=0;i<charArray.length;i++) {
			
			System.out.println("The character is : "+charArray[i]);
		}
	}

}
