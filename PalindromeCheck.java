import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PalindromeCheck {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence ending in . or space.: ");
        java.lang.String str = input.readLine();
        java.lang.String words[] = new java.lang.String[str.length()];
        str = str.toUpperCase();
        int j = 0, ctr = 0, count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '.') {
                java.lang.String subStr = str.substring(j, i);
                j = i + 1;
                words[ctr] = subStr;
                ctr++;
                StringBuffer word = new StringBuffer(subStr);
                word = word.reverse();
                if (subStr.equals(word.toString()))
                    count++;
            }
        }
        if (count > 0) {
            System.out.println("The " + count + " palindrome in Uppercase in this sentence are :");
            for (int i = 0; i < ctr; i++)
                System.out.println(words[i]);
        } else
            System.out.println("Sorry,no palindrome found. ");
    }
}
