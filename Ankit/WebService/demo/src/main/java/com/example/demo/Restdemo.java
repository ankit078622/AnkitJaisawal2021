package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController; 
@RestController
public class Restdemo {
	
	//Get callusing spring based web service
	@GetMapping("/myurl")
	public String sayHello()
	{
		System.out.println("sayHello....");
		return "Hi how are you";
	}
	
	
	//Retrive person info using @get method
	@GetMapping("/personinfo")
	public Person getDummyPerson()
	{
		Person p=new Person();// person class object created
		p.setName("Ram");
		p.setEmail("Ram@gmail.com");
		p.setAddress("Delhi");
		return p;
	}
	
	//Retrieve the person information by id
	@GetMapping("/personinforid/{id}")
	public Person getDummyPersonById(@PathVariable("id") int id)	
	{
		Person p=new Person();
		p.setId(101);
		p.setName("Ram");
		p.setEmail("Ram@gmail.com");
		p.setAddress("Delhi");
		return p;
	}
	
	
	//Retrieve the person information by id and by Integerclass
		@GetMapping("/personinforidInt/{id}")
		public Person getDummyPersonByIdByInteger(@PathVariable("id") Integer id)	
		{
			Person p=new Person();
			p.setId(101);
			p.setName("Ram");
			p.setEmail("Ram@gmail.com");
			p.setAddress("Delhi");
			return p;
		}
	
	

}
