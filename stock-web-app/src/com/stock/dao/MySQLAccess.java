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
     
     
     
     // Statements allow to issue SQL queries to the database
     statement = connect.createStatement();
     // Result set get the result of the SQL query
     resultSet = statement
                     .executeQuery("select * from stock_management.provider");
     writeResultSet(resultSet);


     
    	 } catch (Exception e) {
             throw e;
     } finally {
             close();
     }
    }
    
    
    private void writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
                // It is possible to get the columns via name
                // also possible to get the columns via the column number
                // which starts at 1
                // e.g. resultSet.getSTring(2);
                String firstName = resultSet.getString("name");
                String name = resultSet.getString("firstName");
                String phone = resultSet.getString("phone");
                String adress = resultSet.getString("adress");
         
                System.out.println("Nom: " + firstName);
                System.out.println("Prenom: " + name);
                System.out.println("Téléphone: " + phone);
                System.out.println("Adresse: " + adress);
                
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
