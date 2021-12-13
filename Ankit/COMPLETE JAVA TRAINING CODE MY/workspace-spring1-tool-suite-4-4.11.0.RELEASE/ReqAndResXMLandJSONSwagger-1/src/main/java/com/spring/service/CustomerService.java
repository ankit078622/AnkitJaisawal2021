package com.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.model.Customer;

@Service
public class CustomerService {
	
	static HashMap<Integer, Customer> customerRecord=getCustomerMap();
	
	public CustomerService() {
		super();
		if(customerRecord==null) {
			customerRecord=new HashMap<Integer, Customer>();
			customerRecord.put(1, new Customer(1, "Ankit","ak@gmail.com" , "123ankit"));
			customerRecord.put(2, new Customer(2, "Ajay","aj@gmail.com" , "123ajay"));
		}
	}
	
	public static HashMap<Integer, Customer> getCustomerMap() {
		return customerRecord;
	}

	//Get all the customer 
	public List<Customer> findAllCustomer(){
		List<Customer> customerlist=new ArrayList<Customer>(customerRecord.values());
		return customerlist;
	}
	
	//Adding customer detail
	public Customer addCustomer(Customer customer){
		customer.setCustomerId(getMaxId()+1);
		customerRecord.put(customer.getCustomerId(), customer);
		return customer;
	}

	//Method to get maximum id of customer
	public static Integer getMaxId() {
		Integer max=0;
		for(Integer id: customerRecord.keySet()) {
			if(max<=id)
				max=id;
		}
		return max;
	}
}
