package quiz07;

public class MainProduct {

	public static void main(String[] args) {
		
		Toyota car;
		car = new Toyota("123456789012345679", "camry", true );
		
		//System.out.println(car.model);
		//System.out.println(car.navigator);
		//System.out.println(car.getVin());
		
		car.setVin("ABC45678901234567");
		//System.out.println(car.getVin());
		
		System.out.println("Vin: " + car.getVin() + "\nModel: " + car.model + "\nNavigator: " + car.navigator);
	}

}
