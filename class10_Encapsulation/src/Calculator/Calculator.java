package Calculator;

public class Calculator {
	int a;
	int b;
	
	Calculator(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int addtion(int a, int b) {
		return a+b;
	}
	int findSFT(int width, int length) {
		return width*length;
	}
	
	double calculateRent(int width, int length, double rate) {
		return findSFT(width, length)* rate;
		
	}

}
