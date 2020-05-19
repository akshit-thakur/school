
//class X prog
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LetterFrequency {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence: ");
		java.lang.String S = input.readLine();
		int len = S.length();
		for (int i = 0; i < len; i++) {
			char ch = S.charAt(i);
			int count = 0;
			for (int j = 0; j < len; j++) {
				if (S.charAt(j) == ch && ch != ' ')
					count++;
			}
			S = S.replace(ch, ' ');
			if (ch != ' ')
				System.out.println(ch + " : " + count);
		}

	}
}