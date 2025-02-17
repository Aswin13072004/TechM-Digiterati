package Week_3_Tasks.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change to your database name
        String user = "root";  // XAMPP default user
        String password = "";  // XAMPP default is empty password

        Scanner scanner = new Scanner(System.in);

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // Get User Input
            System.out.print("Enter the ID of the record you want to update: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            System.out.print("Enter the new name: ");
            String newName = scanner.nextLine();

            System.out.print("Enter the new email: ");
            String newEmail = scanner.nextLine();

            // SQL Query to Update the Record
            String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";

            // Create PreparedStatement
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newName);
            pstmt.setString(2, newEmail);
            pstmt.setInt(3, id);

            // Execute Update
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("No record found with ID: " + id);
            }

            // Close Resources
            pstmt.close();
            conn.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
