import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class FactorList {
	public static int n;

	public static void main(String args[]) throws IOException {
		InputStreamReader rdr = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(rdr);
		System.out.println("Enter the number..");
		n = Integer.parseInt(input.readLine()); // intializes
		Factor(n);
	}

	public static void Factor(int x) {
		System.out.println("The Factors of " + x + " are: ");
		for (int i = 1; i <= x; i++) {
			if ((x % i) == 0)
				System.out.println(i);
		}
	}
}