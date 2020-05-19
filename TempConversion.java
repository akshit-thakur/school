import java.io.*;

class TempConversion {
	public static void main(String args[]) throws IOException {
		int C, F, c;
		InputStreamReader rdr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(rdr);
		System.out.println("Choose from the give two...");
		System.out.println("1. Celsius to Farenheit..");
		System.out.println("2. Fareinheit to Celsius..");
		System.out.println("Enter your choice...1 or 2");
		c = Integer.parseInt(input.readLine());
		java.lang.String ch;
		switch (c) {
		case 1:
			System.out.println("Celsius to Farenhiet.....");
			System.out.println("Enter degrees celsius: ");
			ch = input.readLine();
			C = Integer.parseInt(input.readLine());
			F = (9 * C / 5) + 32;
			System.out.println("The temperature in degrees fareinheit is: " + (double) F);
			break;
		case 2:
			System.out.println("Farheinheit to Celsius.....");
			System.out.println("Enter degrees fareinheit: ");
			ch = input.readLine();
			F = Integer.parseInt(input.readLine());
			C = (F - 32) * (9 / 5);
			System.out.println("The temperature in degrees celsius is: " + (double) C);
			break;
		default:
			System.out.println("Incorrect choice.. Re-choose: 1 or 2");
			ch = input.readLine();
			c = Integer.parseInt(ch);
			if (c == 1) {
				System.out.println("Celsius to Farenhiet.....");
				System.out.println("Enter degrees celsius: ");
				C = Integer.parseInt(input.readLine());
				F = (((9 / 5) * C) + 32);
				System.out.println("The temperature in degrees fareinheit is: " + (double) F);
			} else if (c == 2) {
				System.out.println("Farheinheit to Celsius.....");
				System.out.println("Enter degrees fareinheit: ");
				F = Integer.parseInt(input.readLine());
				C = (5 * F / 9 + 32);
				System.out.println("The temperature in degrees celsius is: " + (double) C);
			} else
				System.out.println("Incorrect choice..");
			break;
		}
	}
}