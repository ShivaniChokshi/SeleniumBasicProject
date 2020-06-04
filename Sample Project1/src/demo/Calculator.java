package demo;

public class Calculator {

	public static void main(String[] args) {
		Calculator basicCal = new Calculator(); //Create object of class Calculator to call other methods
		
		basicCal.addNumbers(20,40); // Call add method using object basicCal
		basicCal.addNumbers(100, 25); // We can call a method multiple times with different numbers
		
		basicCal.subtract(100, 45);
		basicCal.multiply(55, 3);
		basicCal.division(100, 40);
		
	}
	
	public void addNumbers(int num1, int num2) { //Created a add method
		int sum = num1 + num2; //Introduced or created a variable to store the addition of num and call when required
		System.out.println(sum); 
		System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
		
	}
	
	public void subtract(int n1, int n2) {
		int diff = n1 - n2;
		System.out.println(diff);
	}
	
	public void multiply(int no1, int no2) {
		int product = no1*no2;
		System.out.println(product);
	}
	
	public void division(int nu1, int nu2) {
		double div = nu1/nu2;
		System.out.println(div);
	}
}
