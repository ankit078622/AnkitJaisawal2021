package com.empdept;
/* Modify the above program to display all the rows where sal is greater than 1000 and less than 2000. 
 * Display the columns ename, job, sal and comm.
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveByDemoEmp {
	
public static void main(String args[]) {
		
		Connection connection=null;
		final String username="sa";
		final String password="Espire123";
		final String jdbcurl = "jdbc:h2:~/Espiredb";
		try {
			Class.forName("org.h2.Driver");
			connection=DriverManager.getConnection(jdbcurl,username,password);
			System.out.println("Connected........");
			Statement statement=connection.createStatement();
			String sql="Select ename,job,sal,comm from EMP where sal>1000 and sal<2000";
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()) {
				
				System.out.println("Emp name : "+rs.getString("ename"));
				System.out.println("Job : "+rs.getString("job"));
				System.out.println("Salary : "+rs.getInt("sal"));
				System.out.println("");
				
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
