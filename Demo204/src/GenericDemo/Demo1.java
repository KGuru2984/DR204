package GenericDemo;

public class Demo1<T> {
	
	private T value;
	
	public Demo1(T v)
	{
		this.value=v;
	}
	
	public T display()
	{
		return this.value;
	}

}
