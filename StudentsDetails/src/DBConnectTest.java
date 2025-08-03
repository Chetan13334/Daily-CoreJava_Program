import java.sql.*;

public class DBConnectTest {
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/KiranAcademy";  
        String user = "root";                                
        String password = "Chetan@123";                                

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connection Successful!");

            // Run SQL query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Display results
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }

            // Close connections
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
