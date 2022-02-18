package quiz06;

public class Product {
	int proId;
	String prodName;
	double prodPrice;
	private String promoCode;
	
	Product()
	{
		
	}
	
	Product(int proId, String prodName, double prodPrice, String promoCode) {
		this.proId = proId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.promoCode = promoCode;
	}
	
	void setPromoCode(String promoCode)
	{
		this.promoCode = promoCode;
	}
	
	String getPromoCode()
	{
		return this.promoCode;
	}
	
	void printAllAttributes()
	{
		System.out.println("Product Id: " + this.proId + "\nProduct Name: " + this.prodName + 
				"\nProduct Price: " + this.prodPrice + "\nPromo Code: " + this.promoCode);
	}
}
