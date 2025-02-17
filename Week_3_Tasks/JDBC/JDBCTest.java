package Week_3_Tasks.JDBC;

import java.sql.*;

public class JDBCTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change to your database name
        String user = "root"; // Default XAMPP username
        String password = ""; // Default password is empty

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL successfully!");

            // Execute a Query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Process Results
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            // Close Connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
