import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DigitReverse {
	public static void main(String args[]) throws IOException {
		int n, d;
		InputStreamReader rdr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(rdr);
		System.out.println("Enter the number: ");
		java.lang.String ch = input.readLine();
		n = Integer.parseInt(ch); // initializes n
		System.out.println("The Reversed number is: ");
		while (n > 0) {
			d = (n % 10); // extracts the last digit
			System.out.print(d); // prints the last digit
			n = (n / 10); // removes the last digit
		}
	}
}