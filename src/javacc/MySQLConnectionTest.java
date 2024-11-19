package javacc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/products_db"; 
        String user = "root"; 
        String password = "Wmg12345678"; 

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection connection = DriverManager.getConnection(url, user, password);
            
            // Check if connection is successful
            if (connection != null) {
                System.out.println("Connected to the MySQL server successfully!");
            } else {
                System.out.println("Failed to connect to the MySQL server.");
            }
            
            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
}
