package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewEmployeeDetails {

	public static void main(String args[])throws Exception {
		
		Connection connection=null;
		final String username="sa";
		final String password="Espire123";
		final String jdbcurl = "jdbc:h2:E:Training/h2databse/Espiredb";
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
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
