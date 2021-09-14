package com.collection2;
//Write a Java program to test if a map contains a mapping for the specified value.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapingForValue {
	
	public static void main(String args[]) {
		Map<Integer,String> emplist=new HashMap<Integer,String>();
		emplist.put(1,"Arjun");
		emplist.put(2,"Rahul");
		emplist.put(3,"Amit");
		emplist.put(4,"Arjun");
		emplist.put(5,"Ramesh");
		
		//Printing mapping
		System.out.println("List of employee : "+emplist);
		
		//Checking mapping for value is present or not
		String value;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value of check mapping exists or not : ");
		value=input.next();
		if(emplist.containsValue(value)) {
			System.out.println("Yes mapping is available for value : "+value);
		}
		else
		{
			System.out.println("Mapping is not available for value : "+value);
		}
		
	}

}
