package quiz06;

public class ProductMain {

	public static void main(String[] args) {
		Product bag;
		bag = new Product(1000, "Hand Bag", 100.10, "PR01");
		
		//bag = new Product();
		
		bag.setPromoCode("Bag01");
		System.out.println(bag.getPromoCode());
		bag.printAllAttributes();
	}

}
