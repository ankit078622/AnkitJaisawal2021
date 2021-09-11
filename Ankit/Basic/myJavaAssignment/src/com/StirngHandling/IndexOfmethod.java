/*
 -> Java String class indexOf() method returns the position of the first occurrence of the specified character 
    or string in a specified string.
 */
package com.StirngHandling;

public class IndexOfmethod {
	
	public static void main(String args[]) {
		
		String s="Welcome to javatpoint";
		//int indexOf(int ch) demo
		int index=s.indexOf('o');// It returns the first occurrence of the specified character index
		System.out.println("Index of character 'o' is : "+index);
		
		int index1=s.indexOf("o");// It returns the index position for the given substring
		System.out.println("Index of substring 'o' is : "+index1);
		
		int index2=s.indexOf("o",5);// It returns the index position for the given substring and from index
		System.out.println("Index of substring 'o' is : "+index2);
		
		int index3=s.indexOf('o',5);// It returns the index position for the given char and from index
		System.out.println("Index of substring 'o' is : "+index3);
			
		
	}

}
