package JDBCDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassUserMain {
public static void main(String[] args) throws SQLException {
//	Scanner sc =new Scanner(System.in);
//	System.out.println("Enter User Id:");
//	int userids=sc.nextInt();
//	sc.nextLine();
	List<UserClass> l1=new ArrayList<UserClass>();
	
	Connection con=DatabaseConfig.getDBConnection(); // ConnectionImpl
	
	if(con!=null)
	{
		PreparedStatement pst=con.prepareStatement("select * from users"); // PrepareStatementImpl
		//pst.setInt(1, userids);
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
//			System.out.println(rs.getObject(2));
			l1.add(new UserClass(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getObject(4),rs.getString(5), rs.getInt(6), rs.getString(7), rs.getTimestamp(8), rs.getTimestamp(9)));
		}
		
		for(UserClass u:l1) {
			System.out.println(u.toString());
		}
	}
			
}
}
