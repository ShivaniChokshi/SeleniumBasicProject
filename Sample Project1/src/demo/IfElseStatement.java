package demo;

import java.util.Scanner;

public class IfElseStatement {
	
	public static void main(String[] args) {
		System.out.println("Which Coffee do you prefer? S/M/L?");
		Scanner inp = new Scanner(System.in); // To take input from console scanner is used. Created obj of scanner class and imported its methods
		String choice = inp.nextLine(); //Next line reads what is entered in next line in console. We will store it in a variable
		
		if(choice.equals("s")) {
			System.out.println("Price is 1$");
		}
		
		else if(choice.equals("m")) {
			System.out.println("Price is 2$");
		}
		else if(choice.equals("L")) {
			System.out.println("Price is 3$");
		}
	}

}
