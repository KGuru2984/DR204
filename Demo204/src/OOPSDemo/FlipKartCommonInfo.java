package OOPSDemo;

public class FlipKartCommonInfo {

	int ID;
	String name;
	long contact;
	String email;
	
	public FlipKartCommonInfo()
	{
		this.ID=100;
		this.name="ITV";
		this.contact=123456;
		this.email="itv@itv.com";
	}
	
	public void display()
	{
		System.out.println("ID:"+ID);
		System.out.println("Name:"+name);
		System.out.println("Contact No:"+contact);
		System.out.println("Email:"+email);
	
	}
	
}