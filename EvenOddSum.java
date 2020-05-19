import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EvenOddSum {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number upto which you want to do the operation..");
		int n = Integer.parseInt(input.readLine()); // initializes n
		int evenSum = 0, oddSum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				evenSum += i;
			else
				oddSum += i;
		}
		System.out.println("The sum of even numbers is: " + evenSum);
		System.out.println("The sum of odd numbers is: " + oddSum);
	}
}