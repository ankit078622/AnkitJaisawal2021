package com.empdept;
/*
 Write a java program that connects to h2 database, queries the inbuilt table “emp” and 
 displays the first two columns (empno using column index and ename using column name )
 of all the rows.
  */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveEmpnoName {
	
	public static void main(String args[]) {
		
		Connection connection=null;
		final String username="sa";
		final String password="Espire123";
		final String jdbcurl = "jdbc:h2:E:Training/h2databse/Espiredb";
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected........");
			Statement statement=connection.createStatement();
			String sql="Select empno,ename from EMP";
			ResultSet rs=statement.executeQuery(sql);
			System.out.println("Emp number"+"\t"+"Emp name");
			while(rs.next()) {
				System.out.println(rs.getInt("empno")+"\t\t"+rs.getString("ename"));
				
			}
				
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//statement.close();
		}
	}

}
