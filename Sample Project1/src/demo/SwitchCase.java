package demo;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		System.out.println("What Day is Today?");
		Scanner input = new Scanner(System.in);
		String day = input.nextLine();
		
		switch(day) { //This means switch cases based on the input stored in variable day
		case "Monday":
			System.out.println("Eat banana today");
			break;
		case "Tuesday":
			System.out.println("Eat almonds today");
			break;
		case "Wednesday":
			System.out.println("Eat raisins today");
			break;
		case "Thursday":
			System.out.println("Eat apple today");
			break;
		case "Friday":
			System.out.println("Eat dryfruit mix today");
			break;
		case "Saturday":
			System.out.println("Eat rice today");
			break;
		case "Sunday":
			System.out.println("Eat out today");
			break;
		
		}
	}

}
