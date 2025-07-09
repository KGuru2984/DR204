package JDBCExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface DBConfig {

	 String url="jdbc:mysql://localhost:3306/nooks";
	 String username="root";
	 String password="root";
	 
	 static Connection getConnection() throws SQLException
	 {
		 return DriverManager.getConnection(url, username, password);
	 }
}
