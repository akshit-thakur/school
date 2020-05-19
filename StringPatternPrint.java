import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StringPatternPrint {
    public static void main(String args[]) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String str = input.readLine();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = 0; j < i; j++)
                System.out.print(str.charAt(j));
            System.out.println();
        }
    }
}