import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PerfectNum {
	public static void FactorSumAndCheck(int n) {
		int s = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				s += i;
		}
		if (s == n)
			System.out.println(n + " is a perfect number.");
		else
			System.out.println(n + " is not a perfect number.");
	}

	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int n = Integer.parseInt(input.readLine());
		FactorSumAndCheck(n);
	}
}