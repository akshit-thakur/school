import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringRevRec {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence: ");
        java.lang.String str = input.readLine();
        int len = 0;
        StringRevRec obj = new StringRevRec();
        obj.stringRev(len, str);
    }

    void stringRev(int len, java.lang.String str) {
        if (len < str.length()) {
            char ch = str.charAt(len);
            stringRev(len + 1, str);
            System.out.print(ch);
        }
    }
}