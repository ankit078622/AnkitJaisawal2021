/*
-> The Java String class replace() method returns a string replacing all the old char or CharSequence to new
   char or CharSequence.
 */
package com.StirngHandling;

public class ReplaceReplaceAllMethod {
	
	public static void main(String args[]) {
		
		//Use of replace() method
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of a to e  
		
		//before replacement
		System.out.println(s1);
		
		//After replacement
		System.out.println(replaceString);
		
		//Use of replaceAll() method
		String s2="javatpoint is a very good website";  
		String replaceAllString=s2.replace("\s","");//replaces all occurrences of a to e  
		
		//before replacement
		System.out.println(s2);
		
		//After replacement
		System.out.println(replaceAllString);
		
		
	}

}
