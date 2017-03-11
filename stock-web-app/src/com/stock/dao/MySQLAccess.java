package com.stock.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLAccess {
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    
    
    public void readDataBase() throws Exception {
    	 try {
             // This will load the MySQL driver, each DB has its own driver
             Class.forName("com.mysql.jdbc.Driver");
             // Setup the connection with the DB
             connect = DriverManager
                             .getConnection("jdbc:mysql://localhost/feedback?"
                 
                            		 + "user=root&password=root");
             
             preparedStatement = connect
                     .prepareStatement("insert into  stock_management.provider values (default, ?, ?, ?, ?)");
     // Parameters start with 1
     preparedStatement.setString(1, "Kallel");
     preparedStatement.setString(2, "Amal");
     preparedStatement.setString(3, "28 664 617");
     preparedStatement.setString(4, "Ariana Tunis");
     preparedStatement.executeUpdate();

     
    	 } catch (Exception e) {
             throw e;
     } finally {
             close();
     }
    }
    	 
    	 
    	// You need to close the resultSet
         private void close() {
                 try {
                         if (resultSet != null) {
                                 resultSet.close();
                         }

                         if (statement != null) {
                                 statement.close();
                         }

                         if (connect != null) {
                                 connect.close();
                         }
                 } catch (Exception e) {

                 }
    
    	
                 
                 
    	
    }

}
