package OOPSDemo;

public class AmazonMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AmazonCustomer ac=new AmazonCustomer(100,"ITV",1234,"a@gmail.com");
		
		AmazonCustomer ac=new AmazonCustomer();
		System.out.println(ac.getShippingAddress());
		System.out.println(ac.getName());
		
	}

}

