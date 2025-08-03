package PreparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateTablePrepared {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy?useSSL=false", "root", "Chetan@123");
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Which id You Want to Modify ? : ");
		 int id = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Enter updated Name");
		 String name = sc.next();
		 sc.nextLine();
		 System.out.println("Enter updated City");
		 String city = sc.next();
		 sc.nextLine();
		 String q =  "UPDATE user SET name = ?, city = ? WHERE id = ?";
		 
		 PreparedStatement stmt =con.prepareStatement(q);
		 stmt.setString(1, name);
		 stmt.setString(2, city);
		 stmt.setInt(3, id);
		 stmt.executeUpdate();
		 int rows = stmt.executeUpdate();
	       
		 System.out.println(" Data insert successfully");
	}

}
