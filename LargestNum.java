
//class X progam
import java.util.Scanner;

class LargestNum {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the values for a,b,c: ");
		a = read.nextInt();
		b = read.nextInt();
		c = read.nextInt();
		System.out.println("\nThe three numbers are: \n" + a + "\n" + b + "\n" + c);
		getLargest(a, b, c);
		read.close();
	}

	public static void getLargest(int x, int y, int z) {
		int r = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z); // result
		System.out.println("\nThe largest number is: " + r);
	}
}
