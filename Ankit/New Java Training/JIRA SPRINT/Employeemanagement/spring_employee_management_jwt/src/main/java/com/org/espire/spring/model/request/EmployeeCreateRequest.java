package com.org.espire.spring.model.request;


public class EmployeeCreateRequest {

	// bring data from REST controller to service
	
	private String username;
	private String password;
	
	
	public EmployeeCreateRequest() {
		super();
	}

	public EmployeeCreateRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
