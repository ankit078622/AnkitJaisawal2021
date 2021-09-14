package com.collection2;
//Write a Java program to test if a map contains a mapping for the specified key.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapingForKey {
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
		Integer key;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the value of check mapping exists or not : ");
		key=input.nextInt();
		if(emplist.containsKey(key)) {
			System.out.println("Yes mapping is available for key : "+key);
		}
		else
		{
			System.out.println("Mapping is not available for key : "+key);
		}
	}


}
