package com.collection2;
//Write a Java program to associate the specified value with the specified key in a Tree Map.
import java.util.Map;
import java.util.TreeMap;

/*
 -> Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
-> Java TreeMap contains only unique elements.
-> Java TreeMap cannot have a null key but can have multiple null values.
-> Java TreeMap is non synchronized.
-> Java TreeMap is non synchronized.

 */
public class AssociateKeyValueITreeMap {
	
	public static void main(String args[]) {
		
		//Adding key and value
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	    map.put(100,"Amit");    
	    map.put(102,"Ravi");    
	    map.put(101,"Vijay");    
	    map.put(103,"Rahul");    
	        
        for(Map.Entry m:map.entrySet()){  
        	System.out.println(m.getKey()+" "+m.getValue());
        }        
			
	}

}
