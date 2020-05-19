import java.io.IOException;
import java.util.Scanner;

class Salary {
	public static void main(String args[]) throws IOException {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the Basic Pay: ");
		int Bp = read.nextInt();
		long HRA = ((40 * Bp) / 100), DA = ((90 * Bp) / 100), total = (DA + HRA + Bp), pf = (10 * Bp) / 100,
				netsalary = (total - pf);
		System.out.println("HRA is: " + HRA);
		System.out.println("DA is: " + DA);
		System.out.println("Total is: " + total);
		System.out.println("PF is: " + pf);
		System.out.println("Net Salary is: " + netsalary);
		if (netsalary > 18000) {
			double Tax = (15 * netsalary) / 100;
			System.out.println("Tax is: " + Tax);
		} else {
			System.out.println("No Tax");
		}
		read.close();
	}
}
