import java.util.Scanner;
class ReportCard {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int a, b, c, d, e, f, g, h, i, j, k;
		System.out.println("Enter marks: ");
		a = read.nextInt();
		b = read.nextInt();
		c = read.nextInt();
		d = read.nextInt();
		e = read.nextInt();
		f = read.nextInt();
		g = read.nextInt();
		h = read.nextInt();
		i = read.nextInt();
		j = read.nextInt();
		k = read.nextInt();
		float result = ((a + b + c + d + e + f + g + h + i + j + k) / 11);
		System.out.println("Percentage = " + result);
		read.close();
	}
}