
//icse 2008
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalinPerfectMenu {
	public static void main(String args[]) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.println("Enter 1 to check for palindrome and 2 to find out perfect num.");
		int n, choice = Integer.parseInt(input.readLine());
		switch (choice) {
		case 1:
			System.out.println("Enter the number to check for palindrome.");
			n = Integer.parseInt(input.readLine());
			checkPalin(n);
			break;
		case 2:
			System.out.println("Enter the number to check for perfect");
			n = Integer.parseInt(input.readLine());
			checkPerfect(n);
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}
	}

	public static void checkPalin(int n) {
		int r = 0, d = 0, c = n;
		while (n != 0) {
			d = n % 10;
			r = (r * 10) + d;
			n /= 10;
		}
		if (r == c) {
			System.out.println(c + " is a palindrome.");
		} else {
			System.out.println(c + " is not a palindrome.");
		}
	}

	public static void checkPerfect(int n) {
		int s = 0;
		for (int i = 1; i < n; i++) {
			if ((n % i) == 0) {
				s += i;
			}
		}
		if (s == n) {
			System.out.println(n + " is a perfect number.");
		} else {
			System.out.println(n + " is not perfect number.");
		}
	}
}