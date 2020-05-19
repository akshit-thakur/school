
//class X program
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class WordCount {
	public static void main(String args[]) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence with a space at the end: (A case sensitive prog.)");
		java.lang.String str = input.readLine();
		System.out.println("Enter the word to be searched: ");
		java.lang.String item = input.readLine();
		int len = str.length(), j = 0, count = 0;
		java.lang.String subStr;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == ' ') {
				subStr = str.substring(j, i);
				if (subStr.equalsIgnoreCase(item))
					count++;
				j = i + 1;
			}
		}
		System.out.println("The sentence is " + str);
		System.out.println("The word " + item + " occurs " + count + " times.");
	}
}
