package PreparedStmt;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) throws Exception{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy?useSSL=false", "root", "Chetan@123");
	 
	 String q = "Insert into user (id ,name , city) values (?,?,?)";
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter id :");
	 int id =sc.nextInt();
	 System.out.println("Enter name :");
	 String name =sc.next();
	 System.out.println("Enter city :");
	 String city =sc.next();
	 
	 PreparedStatement stmt =con.prepareStatement(q);
	 stmt.setInt(1, id);
	 stmt.setString(2, name);
	 stmt.setString(3, city);
	 stmt.executeUpdate();
	 System.out.println(" Data insert successfully");
	
	}
	
	

}
