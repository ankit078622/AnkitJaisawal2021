package com.inheritance;

public abstract class Employee {
	private String name;
	private String address;
	private String phnumber;

	Employee(String name,String address,String phnumber) {
		this.name=name;
		this.address=address;
		this.phnumber=phnumber;
	}
	
	//User define method
	public void mailCheck() {
		System.out.println("Mail check to "+this.name+""+this.address);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhnumber() {
		return phnumber;
	}
	public void setPhnumber(String phnumber) {
		this.phnumber = phnumber;
	}
		

}
