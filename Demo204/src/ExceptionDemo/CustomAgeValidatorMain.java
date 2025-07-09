package ExceptionDemo;

import java.util.Scanner;

public class CustomAgeValidatorMain {
public static void main(String[] args) throws InvalidAgeException {
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter Your Age:");
	int age=sc.nextInt();
	sc.nextLine();
	try
	{
	if(age<18)
	{
		throw new InvalidAgeException("Age should be greater than or equals to 18");
	}
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
	
}
}
