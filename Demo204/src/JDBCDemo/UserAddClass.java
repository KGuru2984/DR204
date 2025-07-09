package JDBCDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserAddClass {
public static void main(String[] args) throws SQLException {
	
	Scanner sc=new Scanner(System.in);
	Connection con=DatabaseConfig.getDBConnection();
	
	if(con!=null)
	{
		System.out.println("Enter User First Name:");
		String firstname=sc.nextLine();
		System.out.println("Enter User Last Name:");
		String lastname=sc.nextLine();
		System.out.println("Enter User Password:");
		String userpass=sc.nextLine();
		System.out.println("Enter User Email:");
		String email=sc.nextLine();
		
		PreparedStatement pst =con.prepareStatement("insert into users (firstname,lastname,upassword,email,flag) values(?,?,?,?,'N')");
		pst.setString(1, firstname);
		pst.setString(2, lastname);
		pst.setString(3, userpass);
		pst.setString(4, email);
		
		int result=pst.executeUpdate();
		System.out.println(result);
		
	}
	
}
}
