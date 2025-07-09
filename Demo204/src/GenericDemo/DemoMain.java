package GenericDemo;

public class DemoMain {
public static void main(String[] args) {
	
	Demo1<String> d1=new Demo1<String>("Hello");
	Demo1<Integer> d2=new Demo1<Integer>(123);
	
	System.out.println(d1.display());
	System.out.println(d2.display());
	
}
}
