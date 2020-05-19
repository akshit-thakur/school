import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PreVowelShift {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word.");
        java.lang.String word = input.readLine();
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                java.lang.String add = word.substring(0, i);
                for (int j = 0; j < add.length(); j++) {
                    char c = add.charAt(j);
                    word = word.replace(c, ' ');
                }
                word = (word.trim()).concat(add.toUpperCase());
                System.out.println(word);
                break;
            }
        }
    }
}