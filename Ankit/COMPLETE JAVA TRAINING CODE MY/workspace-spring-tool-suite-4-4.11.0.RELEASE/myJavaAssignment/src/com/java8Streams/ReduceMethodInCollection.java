package com.java8Streams;
//write a java program  reduce() Method in Collection
import java.util.ArrayList;
import java.util.List;

class Product2{
	int id;
	String name;
	float price;
	public Product2(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class ReduceMethodInCollection {

	public static void main(String args[]) {
		
		List<Product2> productsList = new ArrayList<Product2>();  
        
		//Adding Products  
        productsList.add(new Product2(1,"HP Laptop",25000f));  
        productsList.add(new Product2(2,"Dell Laptop",30000f));  
        productsList.add(new Product2(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product2(4,"Sony Laptop",28000f));  
        productsList.add(new Product2(5,"Apple Laptop",90000f)); 
        
        //
        Float totalPrice=productsList.stream()
        		 .map(product->product.price)  
                 .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        
        System.out.println(totalPrice);
        
        //More precise code
        float totalPrice2=productsList.stream()
        		.map(product->product.price)
        		.reduce(0.0f, Float::sum);
        System.out.println(totalPrice2);
	}
}
