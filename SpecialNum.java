import java.io.IOException;
import java.util.Scanner;

class SpecialNum {
	public static int special(int x, int s) {
		int d = 0, f = 1;
		while (x > 0) {
			d = x % 10;
			f = 1;
			for (int i = 1; i <= d; i++)
				f = f * i;
			s = s + f;
			x = x / 10;
		}
		return s;
	}

	public static void main(String args[]) throws IOException {
		System.out.println("Welcome to the program to check whether a number is special or not.\nEnter a number:");
		Scanner read = new Scanner(System.in);
		int s = 0, num = read.nextInt();
		s = special(num, s);
		if (s == num)
			System.out.println("\n" + num + " is a special number.");
		else
			System.out.println("\n" + num + " is not a special number.");
		read.close();
	}
}