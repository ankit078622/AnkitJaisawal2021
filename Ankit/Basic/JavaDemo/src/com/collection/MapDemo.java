package com.collection;
/*
HashMap cannot contain duplicate keys.
HashMap allows multiple null values but only one null key.
HashMap is an unordered collection. ...
HashMap is not thread-safe. ...
A value can be retrieved only using the associated key.
HashMap stores only object references. ...
will be stored as Integer .
*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String args[]) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Ankit");
		map.put(2, "Ram");
		map.put(3, "Tom");
		map.put(null, null);
		
		//traversing map
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext()) {
		
			Integer keydemo=itr.next();
			String valuedemo=map.get(keydemo);
			System.out.println("Key "+keydemo+" Value "+ valuedemo);
		}
		
	}
}
