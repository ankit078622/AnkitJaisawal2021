package com.demo;

public class Student {

	private int rollNo;
	private String name;
	private String course;
	private float fee;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String course, float fee) {
		super();
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	
}
