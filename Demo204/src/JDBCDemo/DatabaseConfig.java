package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DatabaseConfig {

	String url="jdbc:mysql://localhost:3306/nooks";
	String username="root";
	String password="root";
	
	static Connection getDBConnection() throws SQLException
	{
		return DriverManager.getConnection(url,username,password);
	}
}
