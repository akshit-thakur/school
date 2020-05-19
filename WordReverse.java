import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class WordReverse {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word.");
        java.lang.String word = input.readLine();
        for (int i = word.length(); i > 0; i--)
            System.out.print(word.charAt(i - 1));
    }
}