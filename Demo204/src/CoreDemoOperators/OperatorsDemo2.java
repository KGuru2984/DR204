package CoreDemoOperators;

public class OperatorsDemo2 {
public static void main(String[] args) {
	
	int a=20;
	int b=30;
	
	System.out.println(a>b); //false
	System.out.println(a<b); //true
	System.out.println(10==10); // true
	
	System.out.println(a&b);
	
	System.out.println(Integer.toBinaryString(a));
	System.out.println(Integer.toBinaryString(b));
	System.out.println(Integer.toBinaryString(30));
	
	System.out.println(a<<1);
	System.out.println(a>>1);
	
	// Ternary Operator
	
	//if a> b then something else somthing
	
	int c=a>b?1:2;
	
	System.out.println(c);
	
	
	int x=10;
	
	int y=--x;
	
	System.out.println(y);
	System.out.println(x);
	
	
}
}
