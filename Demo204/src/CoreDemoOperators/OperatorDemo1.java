package CoreDemoOperators;

import java.util.Scanner;

public class OperatorDemo1 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in); 
	String employeeName;
	int employeeAge;
	String employeeJobRole;
	double employeeSalary;
	
	System.out.println("Enter Employee Name:");
	employeeName=sc.nextLine();
	
	System.out.println("Enter Employee Age:");
	employeeAge=sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Employee Job Role:");
	employeeJobRole=sc.nextLine();
	
	System.out.println("Enter Employee Salary:");
	employeeSalary=sc.nextDouble();
	
	System.out.println("Increased Salary:"+ (employeeSalary*1.05));
	
}
}
