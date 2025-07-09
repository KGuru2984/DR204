package GenericDemo;

public class GenericMainDemo {
public static void main(String[] args) {
	
	GenericDemo1<Integer> g1=(a,b) -> {return a+b;};
	
	System.out.println(g1.add(10, 20));
	
	GenericDemo1<String> g2=(a,b) -> {return a+b; };
	
	System.out.println(g2.add("Hello", "Welcome"));
	
}
}
