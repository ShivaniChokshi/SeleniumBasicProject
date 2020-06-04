package demo;

public class BasicCalculations {
	
	public static void main(String[] args) {
		BasicCalculations maths = new BasicCalculations();
		maths.addNumbers(100,200);
		maths.addNumbers(11, 22);
		maths.subNumbers(100, 20);
		maths.multiply(12, 13);
		maths.divisionOfNumbers(300, 20);
	}
	
	public void addNumbers(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		System.out.println("The sum of " +num1+ " and " +num2+ " is " +sum);
		}
	
	public void subNumbers(int n1, int n2) {
		int subtract = n1 - n2;
		System.out.println("The subtraction of "+n1+" and "+n2+" is "+subtract);
	}
	
	public void multiply(int num1, int num2) {
		int product = num1 * num2;
		System.out.println("Product of "+num1+" and "+num2+" is "+product);
	}
	
	public void divisionOfNumbers(int d1, int d2) {
		float div = d1/d2;
		System.out.println("Division is "+div);
	}
	
}
