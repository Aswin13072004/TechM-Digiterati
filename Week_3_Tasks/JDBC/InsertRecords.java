package Week_3_Tasks.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {
     public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change to your database name
        String user = "root";  // XAMPP default user
        String password = "";  // XAMPP default is empty password

        // Sample Data to Insert (You can modify this)
        String[][] users = {
            {"Alice", "alice@example.com"},
            {"Bob", "bob@example.com"},
            {"Charlie", "charlie@example.com"}
        };

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // SQL Query with ? placeholders for parameters
            String sql = "INSERT INTO users (name, email) VALUES (?, ?)";

            // Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Loop through data and insert multiple rows
            for (String[] userData : users) {
                pstmt.setString(1, userData[0]); // Set name
                pstmt.setString(2, userData[1]); // Set email
                pstmt.executeUpdate(); // Execute Insert
                System.out.println("Inserted: " + userData[0] + " - " + userData[1]);
            }

            // Close Connection
            pstmt.close();
            conn.close();
            System.out.println("All records inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
