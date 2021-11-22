package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String args[]) {
		
		Connection connection=null;
		final String username="root";
		final String password="root";
		final String jdbcurl="jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			Statement statement=connection.createStatement();
			String sql="Create table EmployeeDetails ("
					+ "id int not null primary key,"
					+ "name varchar(255),"
					+ "salary int )";
			statement.executeUpdate(sql);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
