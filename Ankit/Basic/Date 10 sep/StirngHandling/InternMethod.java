/*
-> The Java String class intern() method returns the interned string. 
   It returns the canonical representation of string.
-> It can be used to return string from memory if it is created by a new keyword. 
   It creates an exact copy of the heap string object in the String Constant Pool.
 */
package com.StirngHandling;

public class InternMethod {
	
	public static void main(String args[]) {
		
		String s=new String("Hello");
		String s1=new String("Hello");
		String s2="Hello";
		String s3=s.intern();
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		
		
	}

}
