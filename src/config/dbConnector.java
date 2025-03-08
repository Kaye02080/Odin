/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class dbConnector {
    
    public Connection connect;
    
     public dbConnector(){
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/moneyremittance_db", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }
     
     //Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
           try {
        if (connect == null || connect.isClosed()) {
            System.out.println("Database connection is not available.");
            return null; // Return null if the connection is not established
        }

        Statement stmt = connect.createStatement();
        return stmt.executeQuery(sql);
    } catch (SQLException ex) {
        System.out.println("Error executing query: " + ex.getMessage());
        return null; // Return null if an error occurs
    }
        }
        
        //Function to save data
     
      public boolean insertData(String sql) {
    try {
        if (connect == null || connect.isClosed()) {
            System.out.println("Database connection is not available.");
            return false; // Prevent executing SQL if the connection is down
        }

        PreparedStatement pst = connect.prepareStatement(sql);
        int rowsAffected = pst.executeUpdate();
        pst.close();

        if (rowsAffected > 0) {
            System.out.println("Data inserted successfully!");
            return true;
        } else {
            System.out.println("No data was inserted.");
            return false;
        }

    } catch (SQLException ex) {
        System.out.println("SQL Error: " + ex.getMessage());
        return false;
    }
}
       
        
        //Function to update data
        public void updateData(String sql){
          try {
        if (connect == null || connect.isClosed()) {
            System.out.println("Database connection is not available.");
            return; // Prevent executing SQL if the connection is down
        }

        PreparedStatement pst = connect.prepareStatement(sql);
        int rowsUpdated = pst.executeUpdate();
        pst.close();

        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(null, "Data updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "No records were updated.", "Update Failed", JOptionPane.WARNING_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error updating data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
        
        }

    public Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
