package com.java8Streams;
//write a java program   count() Method in Collection
import java.util.ArrayList;
import java.util.List;

class Product4{
	
	int id;
	String name;
	float price;
	public Product4(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class CountMathodsInCollection {

	public static void main(String args[]) {
		
		List<Product4> productslist=new ArrayList<Product4>();
		
		 //Adding Products  
		productslist.add(new Product4(1,"HP Laptop",25000f));  
		productslist.add(new Product4(2,"Dell Laptop",30000f));  
		productslist.add(new Product4(3,"Lenevo Laptop",28000f));  
		productslist.add(new Product4(4,"Sony Laptop",28000f));  
		productslist.add(new Product4(5,"Apple Laptop",90000f));  
		
		long count=productslist.stream()
				.filter(product4->product4.price<30000)
				.count();
		
		System.out.println(count);
	}
}
