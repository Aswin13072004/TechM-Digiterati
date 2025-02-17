package Week_3_Tasks.JDBC;

import java.sql.*;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change to your database name
        String user = "root";  // XAMPP default username
        String password = "";  // XAMPP default password is empty

        Scanner scanner = new Scanner(System.in);

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // Ask user for the ID to delete
            System.out.print("Enter the ID of the record to delete: ");
            int id = scanner.nextInt();

            // SQL DELETE Query
            String sql = "DELETE FROM users WHERE id = ?";

            // Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, id);

            // Execute delete operation
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record with ID " + id + " deleted successfully!");
            } else {
                System.out.println("No record found with ID: " + id);
            }

            // Close resources
            pstmt.close();
            conn.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
