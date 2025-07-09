package OOPSDemo;

public class FlipKartCustomer extends FlipKartCommonInfo
{
	String shippingaddress;
	
	public FlipKartCustomer()
	{
		this.shippingaddress="Dadar";
	}
	@Override
	public void display()
	{
		//super.display();
		System.out.println("Shipping Address:"+shippingaddress);
	}
	
}
