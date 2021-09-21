package com.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementDemo {

	public static void main(String args[])throws Exception {
		
		Connection connection=null;
		final String username="sa";
		final String password="Espire123";
		final String jdbcurl = "jdbc:h2:~/Espiredb";
		Class.forName("org.h2.Driver");
		connection=DriverManager.getConnection(jdbcurl,username,password);
		
		PreparedStatement ps=connection.prepareStatement("insert into EmployeeDetails values(?,?,?)");
				
		//taking values from key using io streams
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		do {
			System.out.println("Enter Emp id : ");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter Emp name : ");
			String name=br.readLine();
			System.out.println("Enter salary : ");
			float salary=Float.parseFloat(br.readLine());
			ps.setInt(1, id);//first column
			ps.setString(2, name);//second column
			ps.setFloat(3, salary);//third column
			int i=ps.executeUpdate();
			System.out.println(i+"record affected");
			
			System.out.println("Do you want to continue : y/n");
			String s=br.readLine();
			if(s.startsWith("n")) {
				break;
			}
			
		}while(true);
		connection.close();
	}
}
