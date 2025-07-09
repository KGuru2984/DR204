package JDBCExample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMainClass {
public static void main(String[] args) throws SQLException {
	
	Connection conn = DBConfig.getConnection();
	
	if(conn != null)
	{
		System.out.println(conn);
		System.out.println("Connection Done.........");
		Statement stmt = conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from users");
		 while (rs.next()) {
			 Object o1=rs.getObject(1);
			 Object o2=rs.getObject(4);
			 System.out.println(o1.toString());
			 //String.valueOf((String)(bytes[])o2)
			 //System.out.println(((String)o2).toCharArray());
			 System.out.println(String.valueOf(((String) o2).toCharArray()));

		 }
	}
}
}
