package ExceptionDemo;

public class AgeValidator {
	
	public void checkAge(int age) throws Exception
	{
		if(age<18)
		{
			throw new Exception("Age is not greater than equals to 18");
		}
		else
		{
			System.out.println("Welcome!");
		}
	}

}
