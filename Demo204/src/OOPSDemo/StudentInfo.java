package OOPSDemo;

public class StudentInfo {

	int studentID;
	String studentName;
	int studentAge;
	
	public StudentInfo(int studentid,String studentname, int studentage)
	{
		studentID=studentid;
		studentName=studentname;
		studentAge=studentage;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student ID:"+studentID);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Age:"+studentAge);
	}
}
