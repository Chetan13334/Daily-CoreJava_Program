package PreparedStmt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectDPrepared {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy?useSSL=false", "root",
				"Chetan@123");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id Which person id ");
		int id = sc.nextInt();
		String q = "SELECT * FROM EmployeS WHERE id = ?";

		PreparedStatement stmt = con.prepareStatement(q);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			String name = rs.getString("name"); // Use column names for clarity
			String city = rs.getString("city");
			System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
		} else {
			System.out.println("No user found with ID " + id);
		}

	}		


}


