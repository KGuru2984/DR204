package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRegistrationMainClass {
public static void main(String[] args) {
	
	List<UserRegistration> users=new ArrayList<UserRegistration>();
	//UserRegistration user1=new UserRegistration(1, "ITVedant","Pass123", 1234567890, 'Y');
	//users.add(user1);
	users.add(new UserRegistration(1, "ITVedant","Pass123", 1234567890, 'Y'));
	//UserRegistration user2=new UserRegistration(2, "Gurunath", "rakesh123", 1234567898, 'Y');
	//users.add(user2);
	users.add(new UserRegistration(2, "Gurunath", "rakesh123", 1234567898, 'Y'));
	
	
	//System.out.println(users);
	//user.add(new UserRegistration(1, "ITVedant", "pass123", 1234567890, 'Y'));
	
	for(UserRegistration u:users)
	{
		if(u.userID==2)
		{
			users.remove(u);
		}
		else
		{
		System.out.println(u.toString());
		}
	}
	System.out.println(users);
//	Iterator<UserRegistration> i1=users.iterator();
//	
//	while(i1.hasNext())
//	{
//		UserRegistration u=i1.next();
//		if(u.userID==2)
//		{
//			i1.remove();
//		}
//		else
//		{
//		System.out.println(u.toString());
//		}
//	}
//	
//	System.out.println(users);
//	System.out.println(users.size());
	
}
}
