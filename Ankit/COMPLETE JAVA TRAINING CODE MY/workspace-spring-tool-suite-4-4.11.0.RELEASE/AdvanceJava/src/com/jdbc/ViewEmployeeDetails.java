package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewEmployeeDetails {

public static void main(String args[])throws Exception {
		
	Connection connection=null;
	final String username="root";
	final String password="root";
	final String jdbcurl="jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected...");
			Statement statement=connection.createStatement();
			
			String sql="select * from EmployeeDetails";
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.println("Employee Id : "+resultSet.getInt("id"));
				System.out.println("Employee Name : "+resultSet.getString("name"));
				System.out.println("Employee Salary : "+resultSet.getFloat("salary")+"\n");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
