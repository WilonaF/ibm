import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JdbcFactory {

	public static Connection getConnection() throws SQLException{
	
		String url = "jdbc:mysql://localhost:3306/ibm";
		
		//Registering driver with driver manager
		DriverManager.registerDriver(new Driver());
		
		//Requesting connection to Driver manager
		Connection conn = DriverManager.getConnection(url, "root", "test@123");
		
		return conn;
	}
}
