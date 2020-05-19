import java.io.*;

class SpecialNumber {
	public static void main(String args[]) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.println("Enter a two-digit number.");
		int n = Integer.parseInt(input.readLine());
		int d = 0, p = 1, s = 0;
		int temp = n;
		while (n != 0) {
			d = n % 10;
			p *= d;
			s += d;
			n /= 10;
		}
		int r = (p + s);
		if (r == temp) {
			System.out.println(temp + " is a special 2-digit number.");
		} else {
			System.out.println(temp + " is not a special 2-digit number.");
		}
	}
}
