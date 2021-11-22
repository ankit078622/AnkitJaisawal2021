package com.StirngHandling;

public class ConcatMethod {
	
	public static void main(String args[]) {
		
		String string1="Hi";
		
		//Here it is not getting changed means it is returning the value
		string1.concat("All");
		
		string1=string1.concat(" All");
		
		System.out.println(string1);
		
		//Second method
		// Also, observe that a string literal can also invoke the concat() method  
        String string2="Reader";
		string2="Book ".concat(string2);
		
		System.out.println(string2);
	}

}
