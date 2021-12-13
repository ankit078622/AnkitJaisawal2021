package com.collection2;
// Write a Java program to check whether a map contains key-value mappings (empty) or not.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckMapIsEmptyOrNot {
	
	public static void main(String args[]) {
		
		Map<Integer,String> emplist=new HashMap<Integer,String>();
		emplist.put(1,"Arjun");
		emplist.put(2,"Rahul");
		emplist.put(3,"Amit");
		emplist.put(4,"Arjun");
		emplist.put(5,"Ramesh");
		
		//Traversing
		Iterator<Integer> empid=emplist.keySet().iterator();
		while(empid.hasNext()) {
			Integer key=empid.next();
			String value=emplist.get(key);
			System.out.println("Key : "+key+"\tValue : "+value);
			
		}
		//Checking map is empty or not
		boolean check=emplist.isEmpty();
		if(check==true) {
			System.out.println("Map is empty ");
		}
		else {
			System.out.println("Map is not empty ");
		}
		
	}

}
