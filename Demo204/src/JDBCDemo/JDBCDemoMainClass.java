package JDBCDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemoMainClass {
	
public static void main(String[] args) throws SQLException
{
	Connection con=DatabaseConfig.getDBConnection();
	
	if(con!=null)
	{
		System.out.println("Connection Done");
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from users");
		while(rs.next())
		{
			System.out.println(rs.getObject(2).toString());
		}
	}
	else
	{
		System.out.println("Connection failed");
	}
	
}
}
