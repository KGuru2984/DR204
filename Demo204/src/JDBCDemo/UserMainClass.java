package JDBCDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserMainClass {
public static void main(String[] args) throws SQLException {
	
	List<UserClass> l1=new ArrayList<UserClass>();
	Connection cn=DatabaseConfig.getDBConnection();
	
	PreparedStatement pst= cn.prepareStatement("select * from users");
	ResultSet rs=pst.executeQuery();
	
	while(rs.next())
	{
		l1.add(new UserClass(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getObject(4), rs.getString(5), rs.getInt(6), rs.getString(7), rs.getTimestamp(8), rs.getTimestamp(9)));
		
	}
	
	for(UserClass u:l1)
	{
		System.out.println(u.toString());
	}
}
}
