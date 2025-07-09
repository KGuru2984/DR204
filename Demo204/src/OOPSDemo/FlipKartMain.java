package OOPSDemo;

public class FlipKartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FlipKartCommonInfo fc=new FlipKartCommonInfo();
//		fc.display();
//		
//		FlipKartCommonInfo fc1=new FlipKartCustomer();
//		fc1.display();
		
		FlipKartCommonInfo fc=new FlipKartCommonInfo() {
			String employeerole;
			@Override
			public void display()
			{
				super.display();
				this.employeerole="Admin";
				System.out.println("Employee Role:"+employeerole);
			}
		};
		
		fc.display();
		
	}

}
