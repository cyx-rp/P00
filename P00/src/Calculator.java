
public class Calculator {
	
	public int add(int a, int b) {
		System.out.println("a:" + a + "b:" + b);
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiple(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		if (b == 0) {
			System.out.println("Denominator is 0");
		}
		return a / b;
	}
	
	public double exponential(int a, int b) {
		
		double result = Math.pow(a, b);
		
		return result;
	}
	
}
