import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Piglatin {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word");
        java.lang.String str = input.readLine();
        str = str.toLowerCase();
        java.lang.String subStr = " ", vowelStr = " ";
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                subStr = str.substring(i + 1, len);
                vowelStr = str.substring(0, i + 1);
                break;
            }
        }
        java.lang.String resultStr = subStr.concat(vowelStr);
        System.out.println("The original word : " + str);
        System.out.println("The piglatin : " + resultStr + "ing");
    }
}