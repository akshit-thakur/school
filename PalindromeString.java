import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromeString {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a word..to check for palindrome.");
		java.lang.String S = input.readLine();
		StringBuffer word = new StringBuffer(S);
		StringBuffer temp = word.reverse();
		java.lang.String str = temp.toString();
		if (str.equals(S)) {
			System.out.println("The String is a palindrome.");
		} else {
			System.out.println("The String is not a palindrome.");
		}
	}
}