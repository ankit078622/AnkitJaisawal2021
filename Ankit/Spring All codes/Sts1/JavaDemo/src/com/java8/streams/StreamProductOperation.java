package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

class Product {

	int id;
	String name;
	float price;
	
	//Constructor
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

public class StreamProductOperation{
	
	public static void main(String arg[]) {
		
		List<Product> productlist=new ArrayList<Product>();
		
		productlist.add(new Product(1,"hp laptop",25000f));
		productlist.add(new Product(2,"dell",40000f));
		productlist.add(new Product(3,"hp laptop",60000));
		productlist.add(new Product(4,"hp.laptop",350000));
		productlist.add(new Product(5,"hp laptop",700000));
		
		
		productlist.stream() //apply streams
		.filter(p->p.price>60000) //filtering price
		.map(pm->pm.price)  //ftching price
		.forEach(System.out::println);
	}
}
