
//class X program
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LongestWord {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence with a space at the end : ");
		String S = input.readLine(), str;
		int len = S.length(), a[] = new int[len];
		int j = 0, max = 0, k = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == ' ') {
				str = S.substring(j, i);
				a[k] = str.length();
				k++;
				j = i + 1;
			}
		}
		for (int i = 0; i < k; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("The longest word has " + max + " letters.");
	}
}