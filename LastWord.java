//class X program
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LastWord {
	public static void main(String args[]) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(reader);
		System.out.println("Enter a sentence: ");
		java.lang.String S = input.readLine();
		int l = S.length(), k = 0;
		java.lang.String str = " ";
		for (int i = 0; i < l; i++) {
			if (S.charAt(i) == ' ')
				k = i;
		}
		str = S.substring(k, l);
		System.out.println("The last word is:" + str);
	}
}