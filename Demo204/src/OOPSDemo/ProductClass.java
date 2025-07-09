package OOPSDemo;

public class ProductClass {
	
	int productID;
	String productName;
	double productPrice;
	int productQunatity;
	


	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQunatity() {
		return productQunatity;
	}

	public void setProductQunatity(int productQunatity) {
		this.productQunatity = productQunatity;
	}

	@Override
	public String toString() {
		return "ProductClass [productID=" + productID + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productQunatity=" + productQunatity + "]";
	}
	
	
	

}
