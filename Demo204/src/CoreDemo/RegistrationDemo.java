package CoreDemo;

import java.util.Scanner;

public class RegistrationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userEmail="";
		String userPassword="";
		String userName="";
		long userContact=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Email Id:");
		userEmail=sc.nextLine();
		
		System.out.println("Enter the password:");
		userPassword=sc.nextLine();
		
		System.out.println("Enter Your Name:");
		userName=sc.nextLine();
		
		System.out.println("Enter Your Contact No:");
		userContact=sc.nextLong();
		
		System.out.println("Below are the Details:");
		System.out.println(userEmail);
		System.out.println(userPassword);
		System.out.println(userName);
		System.out.println(userContact);
		
		

	}

}
