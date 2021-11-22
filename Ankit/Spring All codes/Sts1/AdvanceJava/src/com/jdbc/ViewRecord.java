package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ViewRecord {

	public static void main(String args[]) {
		Connection connection=null;
		final String username="root";
		final String password="root";
		final String jdbcurl="jdbc:mysql://localhost:3306/jdbcdemo";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected...");
			Statement statement=connection.createStatement();
			
			//Retrieving the data we use result set
			String selectSql="select * from customer";
			ResultSet rs=statement.executeQuery(selectSql);
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt("id"));
				System.out.println("Age : "+rs.getString("age"));
				System.out.println("Address : "+rs.getString("address"));
				System.out.println("Salary : "+rs.getInt("Salary"));
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
