package OOPSDemo;

import java.util.Scanner;

public class CustomerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the customer count:");
		int cnt=sc.nextInt();
		sc.nextLine();
		
		PersonalInfo customer1[]=new PersonalInfo[cnt];
		
//		customer1[0]=new PersonalInfo();
//		customer1[1]=new PersonalInfo();
//		
		for(int i=0;i<cnt;i++)
		{
			customer1[i]=new PersonalInfo();
			
			System.out.println("Enter the Customer Id:");
			customer1[i].id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Customer Name:");
			customer1[i].fullname=sc.nextLine();
			
			System.out.println("Enter Customer Age:");
			customer1[i].age=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Customer Contact No:");
			customer1[i].contactno=sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter Customer Email ID:");
			customer1[i].email=sc.nextLine();

		}
		
		for(PersonalInfo p:customer1)
		{
			System.out.println(p.toString());
		}
		
		
		
		
		
//		System.out.println("Customer ID:"+customer1.id);
//		System.out.println("Customer Name:"+ customer1.fullname);
//		System.out.println("Customer Age:"+customer1.age);
//		System.out.println("Customer Contact No:"+customer1.contactno);
//		System.out.println("Customer Email ID:"+customer1.email);
		
		//System.out.println(customer1.toString());
	}

}
