import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy", "root", "Chetan@123");
		String q = "Update user set id ='100' where name =";
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate(q);
		System.out.println(" Data update Done");
		con.close();
	
	}

}
