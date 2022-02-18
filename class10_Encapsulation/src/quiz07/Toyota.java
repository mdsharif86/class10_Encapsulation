package quiz07;

public class Toyota {
	private String vin;
	String model;
	boolean navigator;

	Toyota(String vin, String model, boolean navigator) {
		if(vin.length() == 17)
		{
			this.vin = vin;
		}
		else if(vin.length() < 17)
		{
			System.out.println("Vin number is below 17 characters long, enter valid vin");
		}
		else if(vin.length() > 17)
		{
			System.out.println("Vin number must not exceed 17 characters long, enter valid vin");
		}
		
		this.model = model;
		this.navigator = navigator;
	}

	void setVin(String vin) {
		if(vin.length() == 17)
		{
			this.vin = vin;
		}
		else if(vin.length() < 17)
		{
			System.out.println("Vin number is below 17 characters long, enter valid vin");
		}
		else if(vin.length() > 17)
		{
			System.out.println("Vin number must not exceed 17 characters long, enter valid vin");
		}
	}

	String getVin() {
		return this.vin;
	}
}