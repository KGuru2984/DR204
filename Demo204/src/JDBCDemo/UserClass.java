package JDBCDemo;

import java.sql.Timestamp;


public class UserClass {

	int userID;
	String firstName;
	String lastName;
	Object upassword;
	String email;
	int userType=2;
	String flag;
	Timestamp createdDate;
	Timestamp modifiedDate;
	
	
	public UserClass(int userID, String firstName, String lastName, Object upassword, String email, int userType,
			String flag, Timestamp createdDate, Timestamp modifiedDate) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.upassword = upassword;
		this.email = email;
		this.userType = userType;
		this.flag = flag;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}
	@Override
	public String toString() {
		return "UserClass [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", upassword="
				+ upassword + ", email=" + email + ", userType=" + userType + ", flag=" + flag + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + "]";
	}
	
		
}
