import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDataEx {

	public static void main(String[] args) throws Exception {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy?useSSL=false", "root", "Chetan@123");
		 String q = "Select * from user";
		 
		 Statement stmt =con.createStatement();
		 ResultSet rs = stmt.executeQuery(q);
		 while(rs.next()) {
			 int id=rs.getInt(1);
			 String name =rs.getString(2);
			 String city =rs.getString(3);
			 System.out.println(id +" "  +name+" "+ city);
					 
		 }
		 
		 con.close(); 
				 
	}

}
