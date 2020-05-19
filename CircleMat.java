
//class X practical progam
import java.util.Scanner;

class CircleMat {
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
		System.out.println("The changed matrix: ");
		int ctr = 0;
		for (int i = 2; i >= 0; i--) {
			ctr++;
			if (ctr != 2) {
				for (int j = 2; j >= 0; j--) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 3; j++) {
					System.out.print(m[i][j] + " ");
				}
				System.out.println();
			}
		}
		read.close();
	}
}