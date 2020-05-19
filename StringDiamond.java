
//class X program
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringDiamond {
	public static void main(String args[]) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.println("Enter a word or sentence: ");
		java.lang.String S = input.readLine();
		int len = S.length();
		for (int i = 0; i <= len; i++) {
			System.out.println();
			for (int k = len - i; k >= 1; k--) {
				System.out.print("  ");
			}
			for (int j = i; j > 1; j--) {
				System.out.print(S.substring(0, j) + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(S.substring(0, j) + " ");
			}
		}
		for (int i = len; i >= 0; i--) {
			System.out.println();
			for (int k = 1; k <= len - i; k++) {
				System.out.print("  ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(S.substring(0, j) + " ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(S.substring(0, j) + " ");
			}
		}
	}
}
