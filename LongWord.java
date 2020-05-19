
// Program re-given in class XI
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LongWord {
    public static void main(String args[]) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter the sentence (with a . at end).");
        java.lang.String str = input.readLine();
        int len = str.length(), j = 0, ctr = 0;
        int check[] = new int[len];
        java.lang.String words[] = new java.lang.String[len];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ' || ch == '.') {
                java.lang.String subStr = str.substring(j, i);
                int length = subStr.length();
                check[ctr] = length;
                words[ctr] = subStr;
                j = i + 1;
                ctr++;
            }
        }
        int max = check[0];
        for (int m = 0; m < ctr; m++) {
            if (check[m] > check[max]) {
                max = m;
            }
        }
        System.out.println(words[max] + " is the longest word having " + check[max] + " letters.");
    }
}