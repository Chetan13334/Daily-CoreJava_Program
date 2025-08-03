package PreparedStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectDataPrepaerd {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the id which you want to see :");
		int id= sc.nextInt();
		String h = new String();
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy?useSSL=false", "root",
				"Chetan@123");
		 String q =  " Select * from user where  id = ?";
		 PreparedStatement stmt = con.prepareStatement(q);
		 stmt.setInt(1, id);
		 ResultSet rs=stmt.executeQuery();
		if(rs.next()) {
			String name = rs.getString("name");
			String city = rs.getString("city");
			System.out.println(id+" "+name+" "+city);
		}else {
			System.out.println(h +"No input...");
		
		}
		 
		System.out.println(" Showing data you want.");
	}
}
