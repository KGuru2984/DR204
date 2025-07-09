package CoreDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc=new Scanner(new File("RegistrationDetails.txt"));
		String userEmail="";
		String userPassword="";
		String userName="";
		long userContact=0;
		
		userEmail=sc.nextLine();
		userPassword=sc.nextLine();
		userName=sc.nextLine();
		userContact=sc.nextLong();
		
		System.out.println(userEmail);
		System.out.println(userPassword);
		System.out.println(userName);
		System.out.println(userContact);
		
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.nextLine());
	}

}
