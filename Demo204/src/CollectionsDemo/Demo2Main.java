package CollectionsDemo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Demo2Main {
public static void main(String[] args) {
	
	Map<Integer, String> m1=new HashMap<Integer, String>();
	m1.put(11, "mumbai");
	m1.put(2,"delhi");
	m1.put(3, "pune");
	m1.put(1, "nagpur");
	
	
	System.out.println(m1);
	
	m1.forEach((k1,city) -> {
		System.out.println(k1+ "    ->      "+ city);
	});
	
}
}
