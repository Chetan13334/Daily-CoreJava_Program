import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/thekiranacademy";
		String username = "root";
		String password ="Chetan@123";
		Connection con = DriverManager.getConnection(url, username, password);
//		if(con.isClosed()){
//			System.out.println(" The Connection is closed ");
//		}
//		else {
//			System.out.println(" The Connection is established");
//		}
		
		String q = "Create table EmployeS (id int , name varchar(30),city varchar(30)) ";
		Statement stmt = con.createStatement(); 
		stmt.executeUpdate(q);
		System.out.println(" Table is CREATED succesfully");
		con.close();
	}

}
