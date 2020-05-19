
//class X program. Edited on 29/7/19
import java.io.IOException;
import java.util.Scanner;

class SimpleInterest {
	public static void main(String args[]) throws IOException {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		java.lang.String n = read.nextLine();
		System.out.println("Enter the principal: ");
		int p = read.nextInt();
		System.out.println("Enter the rate of interest in decimals: ");
		float r = read.nextFloat();
		System.out.println("Enter time: ");
		int t = read.nextInt();
		float i = (p * r * t) / 100;
		System.out.println("Enter your account type:(c or s)");
		char a = (char) read.next().charAt(0);
		System.out.println("\nName: " + n); // displays Name
		if (a == 'c') { // operations on Acc. Type
			System.out.println("Current Account");
		} else if (a == 's') {
			System.out.println("Savings Account");
		} else {
			System.out.println("Invalid acc. type.");
		}
		System.out.println("\nPrincipal: " + p); // displays principal
		System.out.println("\nRate of Interest: " + r); // displays rate
		System.out.println("\nTime: " + t); // displays time
		System.out.println("\nInterest: " + i); // displays interest
		System.out.println("\n\nThank you.");
		read.close();
	}
}