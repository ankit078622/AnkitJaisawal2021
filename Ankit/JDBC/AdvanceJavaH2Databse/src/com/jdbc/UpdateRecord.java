package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

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
            Statement statement=connection.createStatement();
            String sql="UPDATE CUSTOMER SET ADDRESS='Ahemdabad' where id=1";
			statement.executeUpdate(sql);
			System.out.println("Record is updated");  
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
