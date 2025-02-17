package Week_3_Tasks.JDBC;

import java.sql.*;
import java.util.Scanner;

public class MenuDrivenJDBC {
    static final String URL = "jdbc:mysql://localhost:3306/testdb"; // Change to your database name
    static final String USER = "root";  // XAMPP default username
    static final String PASSWORD = "";  // XAMPP default password is empty

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to MySQL!");

            while (true) {
                System.out.println("\n===== MENU =====");
                System.out.println("1. Insert a new Row");
                System.out.println("2. Update a Row");
                System.out.println("3. Delete a Row");
                System.out.println("4. Select a Row");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        insertRow(conn, scanner);
                        break;
                    case 2:
                        updateRow(conn, scanner);
                        break;
                    case 3:
                        deleteRow(conn, scanner);
                        break;
                    case 4:
                        selectRow(conn, scanner);
                        break;
                    case 5:
                        System.out.println("Exiting program. Goodbye!");
                        conn.close();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Please enter a number between 1-5.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 INSERT ROW FUNCTION
    public static void insertRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, email);
        
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("New row inserted successfully!");
        }
        pstmt.close();
    }

    // 🔹 UPDATE ROW FUNCTION
    public static void updateRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter the ID of the row to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new email: ");
        String newEmail = scanner.nextLine();

        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, newName);
        pstmt.setString(2, newEmail);
        pstmt.setInt(3, id);

        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Row updated successfully!");
        } else {
            System.out.println("No row found with ID: " + id);
        }
        pstmt.close();
    }

    // 🔹 DELETE ROW FUNCTION
    public static void deleteRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter the ID of the row to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        int rowsDeleted = pstmt.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Row with ID " + id + " deleted successfully!");
        } else {
            System.out.println("No row found with ID: " + id);
        }
        pstmt.close();
    }

    // 🔹 SELECT ROW FUNCTION
    public static void selectRow(Connection conn, Scanner scanner) throws SQLException {
        System.out.print("Enter the ID of the row to retrieve: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);

        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Email: " + rs.getString("email"));
        } else {
            System.out.println("No record found with ID: " + id);
        }

        rs.close();
        pstmt.close();
    }
}
