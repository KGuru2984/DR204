package ArrayDemo;

public class Example1 {

	private static String abc;
	
	private Example1(String v)
	{
		abc=v;
	}
	public static Example1 valueof(String a)
	{
		return new Example1(a);
	}
	
	public static String display()
	{
		return abc;
	}
}
