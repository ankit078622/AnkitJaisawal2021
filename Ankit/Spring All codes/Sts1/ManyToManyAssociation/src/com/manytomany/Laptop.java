package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="laptop_details")
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer laptop_id;
	private String laptop_name;
	private Double price;
	
	@ManyToMany
	private List<Student> student;
	
	public Integer getLaptop_id() {
		return laptop_id;
	}
	public void setLaptop_id(Integer laptop_id) {
		this.laptop_id = laptop_id;
	}
	public String getLaptop_name() {
		return laptop_name;
	}
	public void setLaptop_name(String laptop_name) {
		this.laptop_name = laptop_name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
}
