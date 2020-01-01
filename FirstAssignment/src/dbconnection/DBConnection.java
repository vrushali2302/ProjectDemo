package dbconnection ;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

static Connection con;
	
	public static Connection getConnection()
	{
		try {
			System.out.println("JDBC Connection");
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/users?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			}catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
	
}
