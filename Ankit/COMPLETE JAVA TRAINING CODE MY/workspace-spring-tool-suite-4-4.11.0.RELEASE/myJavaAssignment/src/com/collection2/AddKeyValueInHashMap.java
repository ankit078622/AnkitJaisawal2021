package com.collection2;
//Write a Java program to associate the specified value with the specified key in a HashMap.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AddKeyValueInHashMap {
	
	public static void main(String args[]) {
		
		Map<Integer,String> emplist=new HashMap<Integer,String>();
		emplist.put(1,"Arjun");
		emplist.put(2,"Rahul");
		emplist.put(3,"Amit");
		emplist.put(4,"Arjun");
		emplist.put(5,"Rahul");
		
		//Traverse map
		Iterator<Integer> empid=emplist.keySet().iterator();
		while(empid.hasNext()) {
			Integer key=empid.next();
			String value=emplist.get(key);
			System.out.println("Key : "+key+"\tValue : "+value);
		}
	}

}
