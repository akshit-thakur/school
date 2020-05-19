import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringPattern {
	public static void main(String args[]) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.println("Enter a word.");
		java.lang.String S = input.readLine();
		int len = S.length();
		AscendingPattern(S, len);
		DescendingPattern(S, len);
	}

	public static void AscendingPattern(java.lang.String S, int len) {
		for (int i = 0; i <= len; i++) {
			System.out.print(S.substring(0, i));
			System.out.println();
		}
	}

	public static void DescendingPattern(java.lang.String S, int len) {
		for (int i = len; i >= 0; i--) {
			System.out.print(S.substring(0, i));
			System.out.println();
		}
	}
}
