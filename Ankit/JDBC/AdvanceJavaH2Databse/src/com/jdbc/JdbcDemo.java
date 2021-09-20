package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcDemo {

	public static void main(String ar[]) throws SQLException {

        Connection connection = null;
        final String username = "sa";
        final String password = "Espire123";
        final String jdbcurl = "jdbc:h2:~/Espiredb";
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");   for ms server
        // String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
        // String user = "sa";
        // String pass = "";
         try {

            Class.forName ("org.h2.Driver");

            connection = DriverManager.getConnection(jdbcurl,username,password);///authentication

            System.out.println("connected...");
            /*Statement statement=connection.createStatement();
            String sql="create table customer(id integer not null,"
			+ "age varchar(255), address varchar(255),"
			+ "salary integer,primary key(id))";
			statement.executeUpdate(sql);
			System.out.println("Table is created");
			
			//For storing the data in the table
			/*String insert="INSERT INTO CUSTOMER VALUES(1,'32','Buxar',5000)";
			statement.executeUpdate(insert);
			System.out.println("Done..........");
			
			//Retrieving the data we use result set
			String selectSql="select * from customer";
			ResultSet rs=statement.executeQuery(selectSql);
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt("id"));
				System.out.println("Age : "+rs.getString("age"));
				System.out.println("Address : "+rs.getString("address"));
				System.out.println("Salary : "+rs.getInt("Salary"));
			}  */  
        } 
        catch (Exception e) {
            e.printStackTrace();

        }
         finally {
 			connection.close();
 			//statement.close();
 		}

    }
}
