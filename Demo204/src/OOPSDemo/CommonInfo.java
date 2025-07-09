package OOPSDemo;

public class CommonInfo {

	int ID;
	String name;
	long contactno;
	String email;
	
	public CommonInfo()
	{
		this.ID=100;
		this.name="ITB";
		this.contactno=1234567;
		this.email="a@gmail.com";
	}
	public CommonInfo(int iD, String name, long contactno, String email) {
	
		ID = iD;
		this.name = name;
		this.contactno = contactno;
		this.email = email;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
