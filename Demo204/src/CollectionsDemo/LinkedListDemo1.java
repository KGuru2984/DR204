package CollectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
public static void main(String[] args) {
	
	List<String> cities=new LinkedList<String>();
	cities.add("Mumbai");
	cities.add("Pune");
	cities.add("Delhi");
	
	System.out.println(cities);
	cities.add("Nagpur");	
	System.out.println(cities);	
	cities.add(1,"Banglore");	
	System.out.println(cities);
	
	//iterator forward and backward
	
	 Iterator<String> it1=cities.iterator();
	 System.out.println(".............Iterator Result............");
	 while(it1.hasNext())
	 {
		 System.out.println(it1.next());
	 }
	
	 
	 LinkedList<String> l2=new LinkedList<String>(cities);
	 
	 Iterator<String> it2= l2.descendingIterator();
	 System.out.println("............. Descending Iterator Result ..........");
	 while(it2.hasNext())
	 {
		 System.out.println(it2.next());
	 }
	 
	
}
}
