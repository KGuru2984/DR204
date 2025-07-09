package OOPSDemo;

public class AmazonCustomer extends CommonInfo
{
	String shippingAddress;
	//CommonInfo cobj=new CommonInfo();
	
//	public AmazonCustomer(int id,String name, long cont,String email)
//	{
//		super(id,name,cont,email);
//	}
	
	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	
}
