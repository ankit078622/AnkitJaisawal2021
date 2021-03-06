package com.spring.demo.serviceimp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.Column;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.jparepositories.ProductRepository;
import com.spring.demo.model.Product;
import com.spring.demo.service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{

	//dependency injection busines logic class
	@Autowired
	ProductRepository productRepository;
	
	//For adding the product
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		Product productdetails=productRepository.save(product);
		return productdetails;
	}

	//For fetching the product which is in database
	@Override
	public ArrayList<Product> ListOfProducts() {
		// TODO Auto-generated method stub
		ArrayList<Product> list=(ArrayList<Product>) productRepository.findAll();
		return list;
	}

	//Deleting the particular product by id
	@Override
	public void deleteProductById(long id) {
	    productRepository.deleteById(id);
	}
	
    //Fetching the particular product by id
	@Override
	public Optional<Product> viewProductById(long id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id);
	}

	//Updating the existing product 
	@Override
	public Product updateProduct(Product product) {
		Product product2=productRepository.save(product);
		return product2;
	}


	//Updating the existing product by id
	@Override
	public Product updateOfProductById(long id,Product productDetails) {
		Product productidcheck=productRepository.findAllById(id);
	  if(productDetails.getId()==productidcheck.getId()) {
		  updateProduct(productDetails);
	  }
	  return productidcheck;
	}
	

}
