package com.empdept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String args[]) throws SQLException {
		
		Connection connection=null;
		final String username="sa";
		final String password="Espire123";
		final String jdbcurl = "jdbc:h2:~/Espiredb";
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected........");
			Statement statement=connection.createStatement();
			
			//Inserting record into Department table
			/*String insert="INSERT INTO Dept VALUES(4,'Finance','D3')";
			statement.executeUpdate(insert);
			System.out.println("Done..........");*/
			
			//Inserting record in Emp table
			/*String insert="INSERT INTO EMP VALUES(107,'Anurag','Hr',11,'2020-08-19',25000,22,3)";
			statement.executeUpdate(insert);
			System.out.println("Done..........");		*/		
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
			//statement.close();
		}
	}
}
