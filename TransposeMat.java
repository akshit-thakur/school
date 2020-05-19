
//class X prog
import java.util.Scanner;

class TransposeMat {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);
		int m[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter a number: ");
				m[i][j] = read.nextInt();
			}
		}
		System.out.println("The original matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The changed matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m[j][i] + " ");
			}
			System.out.println();
		}
		read.close();
	}
}