package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {
	
	public static void main(String ar[]) throws SQLException {

        Connection connection = null;
        final String username = "sa";
        final String password = "Espire123";
        final String jdbcurl = "jdbc:h2:E:Training/h2databse/Espiredb";
         try {

            Class.forName ("org.h2.Driver");

            connection = DriverManager.getConnection(jdbcurl,username,password);///authentication

            System.out.println("connected...");
            Statement statement=connection.createStatement();
            /*String sql="create table customer(id integer not null,"
			+ "age varchar(255), address varchar(255),"
			+ "salary integer,primary key(id))";
			statement.executeUpdate(sql);
			System.out.println("Table is created");*/
			
			//For storing the data in the table
			String insert="INSERT INTO CUSTOMER VALUES(5,'32','Buxar',5000)";
			statement.executeUpdate(insert);
			System.out.println("Done..........");
			   
        } 
        catch (Exception e) {
            e.printStackTrace();

        }
         finally {
 			connection.close();
 		}

    }

}
