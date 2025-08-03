import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thekiranacademy?SSL=false", "root", "Chetan@123");
	
		String q = "insert into EmployeS values (105,'Hite','Pune'),(106,'Ram','Akurdi'),(107,'Sita','Delhi'),(108,'AmolR','Pune')";
		Statement stmt = con.createStatement();
		stmt.executeUpdate(q);
		System.out.println("Data Insert Done");
		con.close();
	}
	

}
