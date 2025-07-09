package StreamsDemo;

public class ExampleMain {
	public static void main(String[] args) {
		
		Example obj=(a,b) -> {
			System.out.println(a+b);
		};
		
		
		obj.add(10,30);
		obj.add(56,78);
		
		Example obj1=(a,b) -> 
		{
			System.out.println("Different Logic");
		};
		
		obj1.add(7, 80);
		
		Example2 obj2=() -> {
			System.out.println("Welcome Message!");
		};
		
		obj2.display();
		
	}

}
