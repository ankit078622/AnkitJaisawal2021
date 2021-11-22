package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertRecord {

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
			/*String sql="create table customer(id integer not null,"
					+ "age varchar(255), address varchar(255),"
					+ "salary integer,primary key(id))";
			statement.executeUpdate(sql);
			System.out.println("Table is created");*/
			
			//For storing the data in the table
			String insert="INSERT INTO CUSTOMER VALUES(2,'32','Buxar',5000)";
			statement.executeUpdate(insert);
			System.out.println("Done..........");
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
