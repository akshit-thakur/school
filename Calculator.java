
//four-function user defined program

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Calculator {
	private int result; // intializes values

	void simple() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first number: ");
		int x = Integer.parseInt(input.readLine());
		System.out.print("Enter second number: ");
		int y = Integer.parseInt(input.readLine());
		System.out.println("Press '+' or '-' or '*' or '/' or '%' ");
		char op = (char) (input.read());
		System.out.println("You chose " + op);
		switch (op) {
		case '+':
			result = (x + y);
			break;
		case '-':
			result = (x - y);
			break;
		case '*':
			result = (x * y);
			break;
		case '/':
			result = (x / y);
			break;
		case '%':
			result = (x % y);
			break;
		default:
			System.out.println("Try Invalid operator");
		}
		System.out.println("---- Calculated result is = " + result + " ----");
	}

	void other() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose what to you want to find.");
		System.out.println(
				"1. Natural logarithm.\n2. Absolute Value.\n3. Square Root.\n4. Random Number 0-1.\n5. Exponent.\n6. 		 Factorial.");
		System.out.println("Press 1-6.");
		int choice = Integer.parseInt(input.readLine());
		int n;
		switch (choice) {
		case 1:
			System.out.println("Enter the number to find the log of: ");
			n = Integer.parseInt(input.readLine());
			log(n);
			break;
		case 2:
			System.out.println("Enter the number to find the absolute value of: ");
			n = Integer.parseInt(input.readLine());
			abs(n);
			break;
		case 3:
			System.out.println("Enter the number you want to find square root of: ");
			n = Integer.parseInt(input.readLine());
			root(n);
			break;
		case 4:
			double m = Math.random();
			System.out.println("The random number generated (0-1) is: " + m);
			break;
		case 5:
			System.out.println("Enter the base value: ");
			int a = Integer.parseInt(input.readLine());
			System.out.println("Enter the power: ");
			n = Integer.parseInt(input.readLine());
			exp(a, n);
			break;
		case 6:
			System.out.println("Enter the number you want to find factorial of: ");
			n = Integer.parseInt(input.readLine());
			factorial(n);
			break;
		default:
			System.out.println("Invalid choice.");
		}
	}

	void log(int n) {
		double result = Math.log(n);
		System.out.println("The log of " + n + " is: " + result);
	}

	void abs(int n) {
		double result = Math.abs(n);
		System.out.println("The absolute value of " + n + " is: " + result);
	}

	void root(int n) {
		double result = Math.sqrt(n);
		System.out.println("The square root of " + n + " is: " + result);
	}

	void exp(int a, int n) {
		double result = Math.pow(a, n);
		System.out.println("The result is: " + result);
	}

	void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++)
			fact *= i;
		System.out.println("The factorial of " + n + " is: " + fact);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Calculator obj = new Calculator();
		System.out.println("%%%%% Calculator %%%%%");
		System.out.println("\t 1. Basic Mathematical Calculations \t");
		System.out.println("\t 2. Other Mathematical Calculations \t");
		System.out.println(" press 1 or 2 according to your choice.");
		int choice = Integer.parseInt(input.readLine());
		switch (choice) {
		case 1:
			obj.simple();
			break;
		case 2:
			obj.other();
			break;
		default:
			System.out.println("Invalid choice.");
		}
	}
}