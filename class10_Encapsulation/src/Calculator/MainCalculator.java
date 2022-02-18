package Calculator;

public class MainCalculator {

	public static void main(String[] args) {
		
		Calculator myCal;
		myCal= new Calculator(5, 2);
		
		int result= myCal.addtion(5, 2);
		
		System.out.println("Addtion result:" + result);
		
		
		myCal.calculateRent(10, 20, 5.0);
		
		double rent= myCal.calculateRent(10,  20,  5.0);
		System.out.println("Rent is" + rent);
	
		
		
	}
	
	

}
